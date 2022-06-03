package com.example.meyok.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class StudentsTakeSubjectId implements Serializable {
    private static final long serialVersionUID = -4312072587522520055L;
    @Column(name = "student_no", nullable = false, length = 10)
    private String studentNo;

    @Column(name = "subject_id", nullable = false, length = 10)
    private String subjectId;

    @Column(name = "term_id", nullable = false, length = 10)
    private String termId;

    @Column(name = "entrance_date", nullable = false)
    private LocalDate entranceDate;

    @Column(name = "finish_date", nullable = false)
    private LocalDate finishDate;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        StudentsTakeSubjectId entity = (StudentsTakeSubjectId) o;
        return Objects.equals(this.termId, entity.termId) &&
                Objects.equals(this.studentNo, entity.studentNo) &&
                Objects.equals(this.finishDate, entity.finishDate) &&
                Objects.equals(this.subjectId, entity.subjectId) &&
                Objects.equals(this.entranceDate, entity.entranceDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(termId, studentNo, finishDate, subjectId, entranceDate);
    }

}