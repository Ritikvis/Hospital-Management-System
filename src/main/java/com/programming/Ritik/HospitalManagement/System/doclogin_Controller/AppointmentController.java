package com.programming.Ritik.HospitalManagement.System.doclogin_Controller;
import com.programming.Ritik.HospitalManagement.System.doclogin_Entity.Appointment;
import com.programming.Ritik.HospitalManagement.System.doclogin_Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @PostMapping("/insert")
    public Appointment createAppointment(@RequestBody Appointment appointment){
        return appointmentRepository.save(appointment);
    }
    @GetMapping
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
}
