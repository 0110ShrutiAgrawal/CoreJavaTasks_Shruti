package com.hughes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.model.Employee;
import com.hughes.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository eRepo;
	
	public List<Employee> getEmployees()
	{
		return eRepo.findAll();
	}
	
	//insert into backend
	public Employee createEmployee(Employee e)
	{
		return eRepo.save(e);
	}

}
