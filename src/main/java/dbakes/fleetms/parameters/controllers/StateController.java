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

import dbakes.fleetms.parameters.models.State;
import dbakes.fleetms.parameters.services.StateService;

@Controller
public class StateController {


    @Autowired
    private StateService stateService;

    @GetMapping("/states")
    public String  allStates(Model model){
         List<State> states=stateService.getAllStates();
         model.addAttribute("states", states);
         return "parameters/stateList";
    }

    @GetMapping("/stateAdd")
    public String  stateAdd(Model model){
         return "parameters/stateAdd";
    }
//The Get State By Id
    @GetMapping("/parameters/state/{id}")
    @ResponseBody
    public State getState(@PathVariable Integer id){
        return stateService.stateById(id);
    }


    @PostMapping("/states")
    public String  saveNewState(State state){
        stateService.saveState(state);
        return "redirect:/states";
    }

   @RequestMapping(value="states/delete/{id}", method = {RequestMethod.GET,RequestMethod.DELETE})
    public String deleteAState(@PathVariable Integer id){
     stateService.deleteState(id);
     return "redirect:/states";
    }

   @RequestMapping(value="states/update/{id}", method = {RequestMethod.GET,RequestMethod.PUT})
    public String update(State state){
     stateService.saveState(state);
     return "redirect:/states";
    }

   @GetMapping("/updateState/{id}")
    public String  stateUpdate(@PathVariable Integer id, Model model){
      State state =  stateService.stateById(id);
         model.addAttribute("state", state);
         return "/parameters/updateState";
    }
}
