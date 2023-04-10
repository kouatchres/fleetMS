package dbakes.fleetms.parameters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbakes.fleetms.parameters.models.Country;
import dbakes.fleetms.parameters.repositories.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country>  getAllCountries(){
        return countryRepository.findAll();
    }

    public void saveCountry(Country country) {
        countryRepository.save(country);
    }
    public void deleteCountry(Integer id) {
        countryRepository.deleteById(id);
    }
    public Country countryById(Integer id) {
        return countryRepository.findById(id).orElse(null);
    }

}
