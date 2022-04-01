package com.springrest.assignmentQ5.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.assignmentQ5.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    public Employee findById(int id);
}
