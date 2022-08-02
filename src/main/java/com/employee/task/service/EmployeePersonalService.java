package com.employee.task.service;

import com.employee.task.entity.Employee_Personal;
import com.employee.task.repository.Employee_personalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeePersonalService {

    @Autowired
    Employee_personalRepo employee;

    public String insert(Employee_Personal personal) {
        employee.save(personal);
        return " Data Inserted Successfully";
    }

    public List<Employee_Personal> getAllData() {
        return employee.findAll();
    }

    public Optional<Employee_Personal> getById(long id) {
        return employee.findById(id);
    }

    public String updateData(Employee_Personal personal) {
        employee.save(personal);
        return "Data Updated successfully";
    }

    public String deleteData(long id) {
        employee.deleteById(id);
        return "Data Deleted Successfully on ID  ";
    }
}