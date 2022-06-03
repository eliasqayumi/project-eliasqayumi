package com.example.meyok.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class CollegeDepartmentSubjectId implements Serializable {
    private static final long serialVersionUID = -1817311869983804874L;
    @Column(name = "col_dep_id", nullable = false, length = 10)
    private String colDepId;
    @Column(name = "subject_id", nullable = false, length = 10)
    private String subjectId;


    @Override
    public int hashCode() {
        return Objects.hash(colDepId, subjectId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CollegeDepartmentSubjectId entity = (CollegeDepartmentSubjectId) o;
        return Objects.equals(this.colDepId, entity.colDepId) &&
                Objects.equals(this.subjectId, entity.subjectId);
    }
}