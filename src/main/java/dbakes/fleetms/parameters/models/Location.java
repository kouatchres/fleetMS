package dbakes.fleetms.parameters.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public  class Location {
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
    private Location state;
    private Integer stateId;
}
