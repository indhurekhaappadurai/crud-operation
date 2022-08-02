package com.employee.task.entity;

import javax.persistence.*;

@Entity
public class Employee_Office {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    private long  IdNumber;

    @Column(name="EmployeeId")
    private int employeeIdNumber;

    @Column(name="salary")
    private float salary;

    @Column(name="experiance")
    private String experiance;

    @Column(name="qualification")
    private String qualification;

    public int getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(int employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
