package dbakes.fleetms.parameters.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;


@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class CommonObject {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String description;
    private Integer id;
    private String details;

}
