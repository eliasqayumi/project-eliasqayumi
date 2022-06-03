package com.example.meyok.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Student {
    @Id
    @Column(name = "tc_no", nullable = false, length = 10)
    private String id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "surname", nullable = false, length = 20)
    private String surname;

    @Column(name = "email", nullable = false, length = 30)
    private String email;

    @Column(name = "contact_no", nullable = false, length = 11)
    private String contactNo;

    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;


}