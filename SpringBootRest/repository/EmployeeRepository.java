package com.hughes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hughes.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
//when using jdbc we wrote crud operations but while using jpa no need
}
