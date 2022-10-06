package com.javapoint.Employee.controller;

import com.javapoint.Employee.model.Employee;
import com.javapoint.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    private List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/employee/{id}")
    private Employee getEmployee(@PathVariable("id") int empId)
    {
        return employeeService.getEmployeeById(empId);
    }
    @GetMapping("/employee1")
    private Employee getEmployeeById(@RequestParam("id")int empId)
    {
        return employeeService.getEmployeeById(empId);
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
    private Employee getEmployeeByIdANdName(@RequestParam("id")int empId,@RequestParam("name")String name)
    {
        return employeeService.getEmployeeByIdAndName(empId,name);
    }
    @DeleteMapping("/employee6/{id}")
    private void deleteEmployee(@PathVariable("id")int empId)
    {
         employeeService.delete(empId);
    }
    @PostMapping("/employeeDetails")
    private Employee saveEmployee(@RequestBody Employee employee)
    {
     Employee emp=  employeeService.saveOrUpdate(employee);
     return emp;
    }
}
