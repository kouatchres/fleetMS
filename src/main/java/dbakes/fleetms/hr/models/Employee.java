package dbakes.fleetms.hr.models;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Employee extends Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="employeeTypeId",insertable = false,updatable = false)
    private EmployeeType employeeType;
    private Integer employeeTypeId;
        private String photo;
        private  String userName;
//
//    @ManyToMany
//    @JoinColumn(name="id",insertable = false,updatable = false)
//    private JobTitle jobTitle;
//    private Integer jobTitleId;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hireDate;
}
