package com.employee.task.service;

import com.employee.task.entity.Employee_Office;
import com.employee.task.repository.Employee_OfficeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeOfficeService {

    @Autowired
    Employee_OfficeRepo employee_officeRepo;

    @PostMapping
    public String insert(Employee_Office office){
        employee_officeRepo.save(office);
        return "Data Registered";
    }

    @GetMapping
    public List<Employee_Office> getAllData(){
      return employee_officeRepo.findAll();
    }

    public Optional<Employee_Office> getById(long id){
        return employee_officeRepo.findById(id);
    }

    public String updateData(Employee_Office office){
         employee_officeRepo.save(office);
         return " Data Updated";
    }

    public String deleteData(long id){
        employee_officeRepo.deleteById(id);
        return "deleted Successfully";
    }

    public String delData(long id) {
        employee_officeRepo.findById(id);
        return "Data Deleted";
    }
}
