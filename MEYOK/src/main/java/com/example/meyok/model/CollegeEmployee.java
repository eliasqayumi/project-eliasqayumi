package com.example.meyok.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "college_employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class CollegeEmployee {
    @Id
    @Column(name = "employee_no", nullable = false, length = 10)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tc_no", nullable = false)
    private Employee tcNo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "college_id", nullable = false)
    private College college;

    @Column(name = "entrance_date", nullable = false)
    private LocalDate entranceDate;

    @Column(name = "title", nullable = false, length = 10)
    private String title;

    @Column(name = "task", nullable = false, length = 10)
    private String task;

}