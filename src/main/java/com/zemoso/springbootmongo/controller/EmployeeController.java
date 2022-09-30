package com.zemoso.springbootmongo.controller;

import com.zemoso.springbootmongo.model.Employee;
import com.zemoso.springbootmongo.sevice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping
    public List<Employee> getEmployee(@RequestParam("limit") int limit,@RequestParam("offset") int offset) {
        return employeeService.getEmployee(offset,limit);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable("id") String id) {
        employeeService.deleteEmployee(id);
    }
}