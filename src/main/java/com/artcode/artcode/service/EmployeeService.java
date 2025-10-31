package com.artcode.artcode.service;

import com.artcode.artcode.models.Employee;
import com.artcode.artcode.repositorie.EmployeeRepository;
import com.artcode.artcode.util.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
        existing.setName(employee.getName());
        return repository.save(existing);
    }

    @Override
    public void deleteEmployee(Long id) {
        if (!repository.existsById(id)) {
            throw new EmployeeNotFoundException("Employee not found with id: " + id);
        }
        repository.deleteById(id);
    }
}