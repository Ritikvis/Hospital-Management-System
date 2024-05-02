package com.programming.Ritik.HospitalManagement.System.doclogin_Repository;

import com.programming.Ritik.HospitalManagement.System.doclogin_Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment,Long> {
}
