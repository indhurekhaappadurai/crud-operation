package com.employee.task.repository;

import com.employee.task.entity.Employee_Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employee_personalRepo  extends JpaRepository<Employee_Personal, Long> {
}
