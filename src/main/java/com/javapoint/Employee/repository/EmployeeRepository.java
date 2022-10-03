package com.javapoint.Employee.repository;

import com.javapoint.Employee.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository {
    Employee findByName(String name);

    Employee findByEmail(String email);

    Employee findByAge(int age);

    Employee findByIdAndName(int id, String name);
}
