package peaksoft.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType. SEQUENCE)
    private Long id;

    @Column(name = "first_name")
    private String name;
    @Column(unique = true)
    @Email
    private String email;
    @Column(name = "last_name")
    private String surname;
    @Column(name = "project_team")
    private String projectTeam;
    @Column(name = "laptop_brand")
    private String laptopBrand;
    @Column(name = "age")
    private int age;



}
