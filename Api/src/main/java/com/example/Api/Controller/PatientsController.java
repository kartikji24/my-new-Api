package com.example.Api.Controller;

import com.example.Api.Entitis.Patients;
import com.example.Api.Servers.PatientServes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/v1/patients")
public class PatientsController {
    HashMap<Integer , Patients> patient = new HashMap<>();
    @GetMapping("/helloworld")
    public String helloWorld() {
        String s =  "Hello World from patients";
        return s;
    }

//    @GetMapping("/helloIndia")
//    public String helloIndia() {
//        String s =  "Hello India from patients";
//        return s;
//    }
//
//
    @Autowired
    private PatientServes patientsService;

    @PostMapping("/add")
    public String addPatient(@RequestBody Patients patiens) {
        patientsService.addPatient(patiens);
        return "Patient add successfully";
    }


     @GetMapping("/all")
    public List<Patients> getall(){
        return patientsService.getAllSend();
     }

//     @GetMapping("/{Id}")
//    public Patients getPatient(@PathVariable int Id){
//        return patient.get(Id);
//     }
//
//     @GetMapping("/query")
//    public Patients QueryParameter(@RequestParam int patientId){
//        return patient.get((patientId));
//     }

     @DeleteMapping("/{id}")
    public String DeletePatient(@PathVariable int id){
         patientsService.DeletePatient(id);
        return "Patient Delete Success Fully";
     }
     @PutMapping("/put{id}")
    public int correctDetail(@PathVariable int id , @RequestBody Patients patients){
        return  patientsService.correctDetail(id , patients);

     }

}
