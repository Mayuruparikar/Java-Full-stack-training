package com.training.training.mappings;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Transactional
    public void addDoctorWithPatients(Doctor doctor, List<Patient> patients) {
        doctor.setPatients(patients);
        for (Patient p : patients) {
            p.setDoctor(doctor);
        }
        doctorRepository.save(doctor);
    }
}
