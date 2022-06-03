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
@Table(name = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Department {
    @Id
    @Column(name = "department_id", nullable = false, length = 10)
    private String id;

    @Column(name = "department_name", nullable = false, length = 30)
    private String departmentName;

    @Column(name = "department_details", length = 250)
    private String departmentDetails;



}