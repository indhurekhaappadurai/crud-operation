package com.employee.task.repository;

import com.employee.task.entity.Employee_Office;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_OfficeRepo extends JpaRepository<Employee_Office,Long> {

}
