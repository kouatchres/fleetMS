package dbakes.fleetms.hr.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import dbakes.fleetms.parameters.models.CommonObject;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
//@AllArgsConstructor
//@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public class JobTitle extends CommonObject {
//
//    @ManyToMany
//    @JoinColumn(name="id",insertable = false,updatable = false)
//    private Employee employee;
//    private Integer employeeId;


}
