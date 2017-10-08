package com.learnshare.restapi.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.learnshare.restapi.model.Employee;
import org.springframework.stereotype.Service;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	private static final AtomicLong counter = new AtomicLong();
	
	private static List<Employee> employees;
	
	static{
		employees = populateDummyEmployees();
	}

	public List<Employee> findAllEmployees() {
		return employees;
	}
	
	public Employee findById(long id) {
		for(Employee employee : employees){
			if(employee.getId() == id){
				return employee;
			}
		}
		return null;
	}
	
	public Employee findByName(String name) {
		for(Employee employee : employees){
			if(employee.getName().equalsIgnoreCase(name)){
				return employee;
			}
		}
		return null;
	}
	
	public void saveEmployee(Employee employee) {
		employee.setId(counter.incrementAndGet());
		employees.add(employee);
	}

	public void updateEmployee(Employee employee) {
		int index = employees.indexOf(employee);
		employees.set(index, employee);
	}

	public void deleteEmployeeById(long id) {
		
		for (Iterator<Employee> iterator = employees.iterator(); iterator.hasNext(); ) {
		    Employee employee = iterator.next();
		    if (employee.getId() == id) {
		        iterator.remove();
		    }
		}
	}

	public boolean isEmployeeExist(Employee employee) {
		return findByName(employee.getName())!=null;
	}
	
	public void deleteAllEmployees(){
		employees.clear();
	}

	private static List<Employee> populateDummyEmployees(){
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(counter.incrementAndGet(),"David",30, 70000));
		employees.add(new Employee(counter.incrementAndGet(),"John",40, 50000));
		employees.add(new Employee(counter.incrementAndGet(),"Kani",45, 30000));
		employees.add(new Employee(counter.incrementAndGet(),"Todd",50, 40000));
		return employees;
	}

}
