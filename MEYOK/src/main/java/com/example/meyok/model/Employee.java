package com.example.meyok.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Employee {
    @Id
    @Column(name = "tc_no", nullable = false, length = 11)
    private String id;

    @Column(name = "name", nullable = false, length = 30)
    private String name;

    @Column(name = "surname", nullable = false, length = 30)
    private String surname;

    @Column(name = "contact_no", nullable = false, length = 11)
    private String contactNo;

    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "address", nullable = false, length = 200)
    private String address;


}