package com.rbs.interview.assignment.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rbs.interview.assignment.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}