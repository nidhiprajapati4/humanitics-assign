package com.example.humanitics.Service;

import com.example.humanitics.Entity.Employee;
import com.example.humanitics.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getEmployee() {
        return repository.getAllEmployee();
    }

    public Employee getEmployeeById(int id) {
        return repository.findById(id);
    }

    public String deleteEmployee(int id) {
        repository.delete(id);
        return "Employee removed !! " + id;
    }

    public Employee updateEmployee(Employee employee) {
        return repository.update(employee);
    }
}