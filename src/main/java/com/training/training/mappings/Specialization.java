package com.training.training.mappings;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String field;

    @ManyToMany(mappedBy = "specializations", fetch = FetchType.LAZY)
    private List<Doctor> doctors;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getField() { return field; }
    public void setField(String field) { this.field = field; }
    public List<Doctor> getDoctors() { return doctors; }
    public void setDoctors(List<Doctor> doctors) { this.doctors = doctors; }
}
