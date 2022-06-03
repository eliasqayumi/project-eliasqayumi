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
@Table(name = "subject")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Subject {
    @Id
    @Column(name = "subject_id", nullable = false, length = 10)
    private String id;

    @Column(name = "subject_name", nullable = false, length = 30)
    private String subjectName;

    @Column(name = "subject_credit", nullable = false, length = 2)
    private String subjectCredit;

    @Column(name = "subject_AKTS", nullable = false, length = 2)
    private String subjectAkts;


}