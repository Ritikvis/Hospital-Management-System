package com.programming.Ritik.HospitalManagement.System.Repository;

import com.programming.Ritik.HospitalManagement.System.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {

}
