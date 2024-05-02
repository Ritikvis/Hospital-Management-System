package com.programming.Ritik.HospitalManagement.System.doclogin_Controller;

import com.programming.Ritik.HospitalManagement.System.doclogin_Entity.Medicine;
import com.programming.Ritik.HospitalManagement.System.doclogin_Repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class MedicineController {
    @Autowired
    private MedicineRepository medicineRepository;
   @PostMapping("/insert")
    public Medicine createMedicine(@RequestBody Medicine medicine){
        return medicineRepository.save(medicine);
    }
    @GetMapping
    public List<Medicine> getAllMedicine(){
       return medicineRepository.findAll();
    }
}
