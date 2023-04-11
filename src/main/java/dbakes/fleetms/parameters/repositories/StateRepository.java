package dbakes.fleetms.parameters.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dbakes.fleetms.parameters.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {
}
