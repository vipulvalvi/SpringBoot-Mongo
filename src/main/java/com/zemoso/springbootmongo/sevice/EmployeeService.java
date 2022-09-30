package com.zemoso.springbootmongo.sevice;

import com.zemoso.springbootmongo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(String id);

    List<Employee> getAllEmployee();

    List<Employee> getEmployee(int offset, int limit);

    Employee updateEmployee(Employee employee);

    void deleteEmployee(String id);
}
