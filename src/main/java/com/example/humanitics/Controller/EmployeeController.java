package com.example.humanitics.Controller;

import com.example.humanitics.Entity.Employee;
import com.example.humanitics.Service.EmployeeService;
import com.example.humanitics.Validator.EmployeeValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;
    @Autowired
    private EmployeeValidator validator;

    @PostMapping
    public ResponseEntity addEmployee(@RequestBody Employee employee) {
        String errorMessage = validator.IsValid(employee);

        if(!errorMessage.isEmpty())
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("bad request:-"+ errorMessage);

        return ResponseEntity.ok(service.saveEmployee(employee));
    }

    @GetMapping
    public List<Employee> findAllEmployee() {
        return service.getEmployee();
    }

    @GetMapping("{id}")
    public Employee findProductById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }
}