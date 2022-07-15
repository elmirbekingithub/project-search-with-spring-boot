package peaksoft.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.Email;

@Getter
@Setter
public class StudentRequest {
    private String name;
    private String surname;
    private String projectTeam;
    private String laptopBrand;
    @Column(unique = true)
    @Email
    private String email;
    private int age;


}
