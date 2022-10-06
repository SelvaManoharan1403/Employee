package com.javapoint.Employee.repository;

import com.javapoint.Employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee,String> {
    Employee findByName(String name);

    Employee findByEmail(String email);

    Employee findByAge(int age);

    Employee findByIdAndName(int empId, String name);

    Employee findByEmpId(int empId);

    Employee deleteById(int empId);
}
