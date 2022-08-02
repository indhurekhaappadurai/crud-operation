package com.employee.task.controller;

import com.employee.task.entity.Employee_Office;
import com.employee.task.service.EmployeeOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeOfficeController {

    @Autowired
    EmployeeOfficeService employeeOfficeService;

    @PostMapping("/post")
    public String insert(@RequestBody Employee_Office office){
        return employeeOfficeService.insert(office);

    }
    @GetMapping("/getdata")
    public List<Employee_Office> getAllData() {
        return employeeOfficeService.getAllData();
    }

    @GetMapping("/getid")
    public Optional<Employee_Office> getById(@RequestParam long id){
        return employeeOfficeService.getById(id);
    }

    @PutMapping("/update")
    public String updateDate(@RequestBody Employee_Office office){
        return employeeOfficeService.updateData(office);
    }

    @DeleteMapping("/delete")
    public String delData(@PathVariable long id){
        return employeeOfficeService.delData(id);
    }
}
