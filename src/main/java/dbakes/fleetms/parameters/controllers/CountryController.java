package dbakes.fleetms.parameters.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import dbakes.fleetms.parameters.models.Country;
import dbakes.fleetms.parameters.services.CountryService;

@Controller
public class CountryController {


    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String  allCountries(Model model){
         List<Country> countries=countryService.getAllCountries();
         model.addAttribute("countries", countries);
         return "parameters/countryList";
    }

    @GetMapping("/countryAdd")
    public String  countryAdd(Model model){
         return "parameters/countryAdd";
    }
//The Get Country By Id
    @GetMapping("/parameters/country/{id}")
    @ResponseBody
    public Country getCountry(@PathVariable Integer id){
        return countryService.countryById(id);
    }


    @PostMapping("/countries")
    public String  saveNewCountry(Country country){
        countryService.saveCountry(country);
        return "redirect:/countries";
    }

   @RequestMapping(value="countries/delete/{id}", method = {RequestMethod.GET,RequestMethod.DELETE})
    public String deleteACountry(@PathVariable Integer id){
     countryService.deleteCountry(id);
     return "redirect:/countries";
    }

   @RequestMapping(value="countries/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(Country country){
     countryService.saveCountry(country);
     return "redirect:/countries";
    }

   @GetMapping("/updateCountry/{id}")
    public String  countryUpdate(@PathVariable Integer id, Model model){
      Country country =  countryService.countryById(id);
         model.addAttribute("country", country);
         return "/parameters/updateCountry";
    }
}
