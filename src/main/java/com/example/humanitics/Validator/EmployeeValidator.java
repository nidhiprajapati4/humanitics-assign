package com.example.humanitics.Validator;

import com.example.humanitics.Entity.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeValidator {
    public String IsValid(Employee employee) {
        if(employee.getEmployee_id() == 0)
        {
            return "Please provide id of the employee";
        }
        if(employee.getEmployee_code() == null || employee.getEmployee_code().trim().isEmpty())
        {
            return "Please provide code of the employee";
        }
        if(employee.getName() == null || employee.getName().trim().isEmpty())
        {
            return "Please provide name of the employee";
        }
        if(employee.getGender() == null || employee.getGender().trim().isEmpty())
        {
            return "Please provide gender of the employee";
        }
        if(employee.getDepartment_id() == 0)
        {
            return "Please provide id of the department";
        }
        return "";
    }
}