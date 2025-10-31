package com.artcode.artcode.service;

import com.artcode.artcode.models.Employee;

import java.util.List;

public interface IEmployeeService {

    Employee createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);
}
