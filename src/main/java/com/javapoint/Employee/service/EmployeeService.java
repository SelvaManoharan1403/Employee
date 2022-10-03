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
    public List<Object> getAllEmployee()
    {
        List<Object> employees =new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }
    public Employee getEmployeeById(int id)
    {
        return (Employee) employeeRepository.findById(id).get();
    }
    public void saveOrUpdate(Employee employee){
        employeeRepository.save(employee);
    }
    public void delete(int id)
    {
        employeeRepository.deleteById(id);
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
    public Employee getEmployeeByIdAndName(int id,String name)
    {
        return employeeRepository.findByIdAndName(id,name);
    }
}
