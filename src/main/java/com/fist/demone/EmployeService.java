package com.fist.demone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
@Service
public class EmployeService {
    @Autowired
    private EmployeRepo employeRepo;

    public List<Employe> getEmp() {
        return employeRepo.findAll();
    }


    public Employe addEmp(Employe employe) {
        return employeRepo.save(employe);
    }

    public String updateEmp(Employe employe) {
       if(!employeRepo.findById(employe.getId()).isEmpty()){
            employeRepo.save(employe);
            return "Updated";
        }
       return "Not found";

    }

    public void delEmp(Integer ID) {
         employeRepo.deleteById(ID);
    }
}
