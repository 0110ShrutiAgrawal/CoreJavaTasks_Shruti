package com.hughes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hughes.model.Employee;
import com.hughes.services.EmployeeService;

@RestController
//we can use request mapping at class level also.
@RequestMapping("/api")
public class EmployeeController {
	
	//controller>service>repository mapping to be done via autowiring
	@Autowired
	EmployeeService empService;
	
	//when we request get method then only this will be called
	//read
	@RequestMapping(value = "/employees",method=RequestMethod.GET)
	public List<Employee> readEmployees() {
		return empService.getEmployees();
	}
	
	//insert
	@RequestMapping(value="/insertemployee",method=RequestMethod.POST)
	public Employee insertEmployee(@RequestBody Employee emp)
	{
		return empService.createEmployee(emp);
	}

}
