package com.fist.demone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@RestController
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    @GetMapping("/get")
    public List<Employe> getEmp(){
        return employeService.getEmp();
    }

    @PostMapping
    public String addEmp(@RequestBody Employe employe){
         employeService.addEmp(employe);
         return "Success";

    }

    @PutMapping
    public String updateEmp(@RequestBody Employe employe){
         return  employeService.updateEmp(employe);

    }

@DeleteMapping("/{ID}")
   public void  delEmp(@PathVariable Integer ID){
         employeService.delEmp(ID);

   }


}
