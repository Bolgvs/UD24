package service;

import java.util.List;

import dto.Employee;

public interface IEmployeeService {
	
		public List<Employee> listEmployees();
	
		public List<Employee> EmployeesByName(String name);
		
		public Employee createEmployee(Employee employee);
		
		public Employee EmployeeById(Long id);
		
		public void deleteEmployee(Long id);
		
		public Employee updateEmployee(Employee employee);
		
	}

