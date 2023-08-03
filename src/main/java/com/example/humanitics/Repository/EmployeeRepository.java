package com.example.humanitics.Repository;

import com.example.humanitics.Entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EmployeeRepository {
    private List<Employee> list = new ArrayList<Employee>();

    public void createProducts() {
        list = List.of(
                new Employee(1,"12234","Nidhi", new Date() , "female", true, new Date(),new Date(),10),
                new Employee(2,"43586","Java", new Date() , "language", true, new Date(),new Date(),10),
                new Employee(3,"7982","Springboot", new Date() , "framework", true, new Date(),new Date(),10)
        );
    }

    public List<Employee> getAllEmployee() {
        return list;
    }

    public Employee findById(int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployee_id() == (id)) {
                return list.get(i);
            }
        }
        return null;
    }

    public List<Employee> search(String name) {
        return list.stream().filter(x -> x.getName().startsWith(name)).collect(Collectors.toList());
    }

    public Employee save(Employee e) {
        Employee employee = new Employee();
        employee.setEmployee_id(e.getEmployee_id());
        employee.setEmployee_code(e.getEmployee_code());
        employee.setName(e.getName());
        employee.setGender(e.getGender());
        employee.setDepartment_id(e.getDepartment_id());
        list.add(employee);
        return employee;
    }

    public String delete(Integer id) {
        list.removeIf(x -> x.getEmployee_id() == (id));
        return null;
    }

    public Employee update(Employee employee) {
        int idx = 0;
        int id = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployee_id() == (employee.getEmployee_id())) {
                id = employee.getEmployee_id();
                idx = i;
                break;
            }
        }

        Employee employee1 = new Employee();
        employee1.setEmployee_id(id);
        employee1.setEmployee_id(employee.getEmployee_id());
        employee1.setName(employee.getName());
        employee1.setGender(employee.getGender());
        employee1.setDepartment_id(employee.getDepartment_id());
        list.set(idx, employee);
        return employee1;
    }
}