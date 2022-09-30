package com.zemoso.springbootmongo.seviceimpl;

import com.zemoso.springbootmongo.dao.EmployeeDao;
import com.zemoso.springbootmongo.model.Employee;
import com.zemoso.springbootmongo.sevice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeDao.createEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public List<Employee> getEmployee(int offset, int limit) {
        return employeeDao.getEmployee(offset,limit);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDao.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeDao.deleteEmployee(id);
    }
}
