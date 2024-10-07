package com.example.Api.repositories;

import com.example.Api.Entitis.Patients;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
@Repository
public class PatientRepositories {
    private HashMap<Integer, Patients> patientMap = new HashMap<>();

    public ArrayList<Patients> getAllSend(){
        return new ArrayList<>(patientMap.values());
    }

    public String addPatient( Patients patiens) {
        int key = patiens.getId();
        patientMap.put(key, patiens);
        return "Patient add successfully";
    }

    public String DeletePatient( int id){
        patientMap.remove(id);
        return "Patient Delete Success Fully";
    }

    public int correctDetail(int id , Patients patients){
        patientMap.put(id , patients);
        return 200;
    }
}
