package com.javapoint.Employee.controller;

import com.javapoint.Employee.model.Employee;
import com.javapoint.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    private List<Object> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employee/{id}")
    private Employee getEmployee(@PathVariable("id")int id)
    {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/employee1")
    private Employee getEmployeeById(@RequestParam("id")int id)
    {
        return employeeService.getEmployeeById(id);
    }
    @GetMapping("/employee2")
    private Employee getEmployeeByEmail(@RequestParam("email")String email)
    {
        return employeeService.getEmployeeByEmail(email);
    }
    @GetMapping("/employee3")
    private Employee getEmployeeByAge(@RequestParam("age")int age)
    {
        return employeeService.getEmployeeByAge(age);
    }
    @GetMapping("/employee4")
    private Employee getEmployeeByName(@RequestParam("name")String name)
    {
        return employeeService.getEmployeeByName(name);
    }
    @GetMapping("/employee5")
    private Employee getEmployeeByIdANdName(@RequestParam("id")int id,@RequestParam("name")String name)
    {
        return employeeService.getEmployeeByIdAndName(id,name);
    }
    @DeleteMapping("/employee/{id}")
    private void deleteEmployee(@PathVariable("id")int id)
    {
         employeeService.delete(id);
    }
    @PostMapping("/employee")
    private int saveEmployee(@RequestBody Employee employee)
    {
        employeeService.saveOrUpdate(employee);
        return Employee.getId();
    }
}
