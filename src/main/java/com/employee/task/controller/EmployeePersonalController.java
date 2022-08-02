package com.employee.task.controller;

import com.employee.task.entity.Employee_Personal;
import com.employee.task.service.EmployeePersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class EmployeePersonalController {

    @Autowired
    EmployeePersonalService employeePersonalService;

    @PostMapping("/insert")
    public String insert(@RequestBody Employee_Personal personal) {
        return employeePersonalService.insert(personal);

    }
    @GetMapping("/getAll")
    public List<Employee_Personal> getAllData() {
        return employeePersonalService.getAllData();
    }

    @GetMapping("/getbyid")
    public Optional<Employee_Personal> getById(@RequestParam long id) {
        return employeePersonalService.getById(id);
    }

    @PutMapping("/updatedata")
    public String updateData(@RequestBody Employee_Personal personal) {
        return employeePersonalService.updateData(personal);
    }

    @DeleteMapping("/deletedata/{id}")
    public String delete(@PathVariable  long id) {
        return employeePersonalService.deleteData(id);
    }

}
