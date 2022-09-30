package com.zemoso.springbootmongo.daoimpl;

import com.zemoso.springbootmongo.dao.EmployeeDao;
import com.zemoso.springbootmongo.model.Employee;
import com.zemoso.springbootmongo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getEmployee(int page, int limit) {
        Pageable pageable = Pageable.ofSize(limit);
        pageable = pageable.withPage(page);
        return employeeRepository.findAll(pageable).stream().toList();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(String id) {
        employeeRepository.deleteById(id);
    }
}
