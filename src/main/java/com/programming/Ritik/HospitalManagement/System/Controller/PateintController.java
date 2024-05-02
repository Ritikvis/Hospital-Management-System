package com.programming.Ritik.HospitalManagement.System.Controller;

import com.programming.Ritik.HospitalManagement.System.Repository.PatientRepository;
import com.programming.Ritik.HospitalManagement.System.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PateintController {
    @Autowired
     private PatientRepository patientRepository;
    @PostMapping("/insert")
    public Patient createPateint(@RequestBody Patient patient){
        return patientRepository.save(patient);
    }
    @GetMapping
    public List<Patient> getAllPateint(){
        return patientRepository.findAll();
    }
}
