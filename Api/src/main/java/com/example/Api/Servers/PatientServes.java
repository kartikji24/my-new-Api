package com.example.Api.Servers;

import com.example.Api.Entitis.Patients;
import com.example.Api.repositories.PatientRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PatientServes {

    @Autowired
    private PatientRepositories patientRepositories;

    public ArrayList<Patients> getAllSend(){
        return patientRepositories.getAllSend();
    }

    public String addPatient(Patients patiens) {
       return patientRepositories.addPatient(patiens);
    }

    public String DeletePatient( int id){
       return patientRepositories.DeletePatient(id);
    }

    public int correctDetail(int id , Patients patients){
       return patientRepositories.correctDetail(id, patients);
    }

}
