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
@Table(name = "expertise")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Expertise {
    @Id
    @Column(name = "expertise_id", nullable = false, length = 10)
    private String id;

    @Column(name = "expertise_part", nullable = false, length = 30)
    private String expertisePart;



}