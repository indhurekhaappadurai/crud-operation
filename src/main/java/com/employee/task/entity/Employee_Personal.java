package com.employee.task.entity;

import javax.persistence.*;

@Entity
public class Employee_Personal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="employeeIdNumber")
    private long employeeIdNumber;

    @Column(name="name")
    private  String name;

    @Column(name="age")
    private int age;

    @Column(name="Dob")
    private String dob;

    @Column(name="Address")
    private String address;

    public long getEmployeeIdNumber() {
        return employeeIdNumber;
    }

    public void setEmployeeIdNumber(long employeeIdNumber) {
        this.employeeIdNumber = employeeIdNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
