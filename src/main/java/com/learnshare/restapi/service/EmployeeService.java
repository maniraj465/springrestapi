package com.learnshare.restapi.service;


import java.util.List;

import com.learnshare.restapi.model.Employee;

public interface EmployeeService {
	
	Employee findById(long id);
	
	Employee findByName(String name);
	
	void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployeeById(long id);

	List<Employee> findAllEmployees();
	
	void deleteAllEmployees();
	
	boolean isEmployeeExist(Employee employee);
	
}
