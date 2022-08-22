package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.EmployeeDAO;
import dto.Employee;



@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeDAO EmployeeDAO;

	@Override
	public List<Employee> listEmployees() {
		
		return EmployeeDAO.findAll();
	}

	@Override
	public List<Employee> EmployeesByName(String name) {
	
		return EmployeeDAO.findByName(name);
	}

	@Override
	public Employee createEmployee(Employee employee) {
	
		return EmployeeDAO.save(employee);
	}

	@Override
	public Employee EmployeeById(Long id) {
		
		return EmployeeDAO.findById(id).get();
	}

	@Override
	public void deleteEmployee(Long id) {
	
		EmployeeDAO.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
	
		return EmployeeDAO.save(employee);
	}
	
	

}
