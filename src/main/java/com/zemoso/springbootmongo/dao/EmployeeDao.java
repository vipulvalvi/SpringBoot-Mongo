package com.zemoso.springbootmongo.dao;

import com.zemoso.springbootmongo.model.Employee;

import java.util.List;

public interface EmployeeDao {
    Employee createEmployee(Employee employee);

    Employee getEmployeeById(String id);

    List<Employee> getAllEmployee();

    List<Employee> getEmployee(int offset, int limit);

    Employee updateEmployee(Employee employee);


    void deleteEmployee(String id);
}
