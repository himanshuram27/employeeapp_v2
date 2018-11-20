package com.employee.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/v1/api/employees")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		
		employeesList.add(new Employee(1, "himanhsu", "ram", "a@gmail.com"));
		employeesList.add(new Employee(2, "anshu", "ram", "b@gmail.com"));
		employeesList.add(new Employee(3, "ajay", "ram", "c@gmail.com"));
		employeesList.add(new Employee(4, "veera", "ram", "d@gmail.com"));
		employeesList.add(new Employee(5, "abhinav", "ram", "e@gmail.com"));
		return employeesList;
    }

}
