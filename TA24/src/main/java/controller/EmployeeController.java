package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.Employee;
import service.EmployeeService;



@RestController
@RequestMapping("/api")
public class EmployeeController {
		
		@Autowired
		EmployeeService employeeService;
		
		@GetMapping("/employees")
		public List<Employee> listEmployees(){
			return employeeService.listEmployees();
		}
		
		@GetMapping("/employees/name/{name}")
		public List<Employee> EmployeesByName(@PathVariable(name="name") String name) {
			return employeeService.EmployeesByName(name);
		}
		
		@PostMapping("/employees")
		public Employee createEmployee(@RequestBody Employee employee) {
			return employeeService.createEmployee(employee);
		}
		
		@GetMapping("/employees/{id}")
		public Employee EmployeeById(@PathVariable(name="id") Long id) {
			Employee EmployeeById = new Employee();
			EmployeeById = employeeService.EmployeeById(id);
			
			return EmployeeById;
		}		
		@PutMapping("/employees/{id}")
		public Employee updateEmployee(@PathVariable(name="id") Long id, @RequestBody Employee employee) {
			Employee selectedEmployee = new Employee();
			Employee updateEmployee = new Employee();
			
			selectedEmployee = employeeService.EmployeeById(id);
			
			selectedEmployee.setName(employee.getName());
			selectedEmployee.setSurname(employee.getSurname());
			selectedEmployee.setWork(employee.getWork());
			selectedEmployee.setSalary(employee.getSalary());
			
			updateEmployee = employeeService.updateEmployee(selectedEmployee);
			
			return updateEmployee;
		}
		
		@DeleteMapping("/empleados/{id}")
		public void deleteEmployee(@PathVariable(name="id") Long id) {
			employeeService.deleteEmployee(id);
		}
}
