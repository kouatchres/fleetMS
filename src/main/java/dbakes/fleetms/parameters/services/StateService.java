package dbakes.fleetms.parameters.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dbakes.fleetms.parameters.models.State;
import dbakes.fleetms.parameters.repositories.StateRepository;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State>  getAllStates(){
        return stateRepository.findAll();
    }

    public void saveState(State state) {
        stateRepository.save(state);
    }
    public void deleteState(Integer id) {
        stateRepository.deleteById(id);
    }
    public State stateById(Integer id) {
        return stateRepository.findById(id).orElse(null);
    }

}
