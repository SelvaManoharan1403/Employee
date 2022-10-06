package com.javapoint.Employee.service;

import com.javapoint.Employee.model.Employee;
import com.javapoint.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee()
    {
        List<Employee> employees = new ArrayList<Employee>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }
    public Employee getEmployeeById(int empId)
    {
        return employeeRepository.findByEmpId(empId);
    }
    public Employee saveOrUpdate(Employee employee)
    {
      Employee emp=  employeeRepository.save(employee);
      return emp;
    }
    public Employee delete(String name)
    {
      return employeeRepository.deleteByName(name);
    }
    public Employee getEmployeeByName(String name)
    {
        return employeeRepository.findByName(name);
    }
    public Employee getEmployeeByEmail(String email)
    {
        return employeeRepository.findByEmail(email);
    }
    public Employee getEmployeeByAge(int age)
    {
        return employeeRepository.findByAge(age);
    }
    public Employee getEmployeeByNameAndAge(String name, int age)
    {
        return employeeRepository.findByNameAndAge(name,age);
    }
}
