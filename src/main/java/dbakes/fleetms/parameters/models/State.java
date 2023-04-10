package dbakes.fleetms.parameters.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
    public  class State {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Integer id;
        private String description;
        private String details;
        private String city;
        private String address;

        @ManyToOne
        @JoinColumn(name="id",insertable = false,updatable = false)
        private Country country;
        private Integer countryId;
        @ManyToOne
        @JoinColumn(name="id",insertable = false,updatable = false)
        private State state;
        private Integer stateId;
}
