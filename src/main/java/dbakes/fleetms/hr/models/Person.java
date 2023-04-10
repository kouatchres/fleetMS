package dbakes.fleetms.hr.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import dbakes.fleetms.parameters.models.Country;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id")
public  class Person {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String otherName;
    private String address;
    @Formula(value="concat(firstName,''.lastName)")
            private String fullName;

    private String title;
    private String initials;
    private String SSN;
    private String gender;
    private String maritalStatus;

    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date dateOfBirth;
    private String city;
    private String phone;
    private String mobile;
    private String photo;
    private String email;


}
