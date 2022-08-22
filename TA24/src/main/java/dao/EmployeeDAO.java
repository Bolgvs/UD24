package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import dto.Employee;

public interface EmployeeDAO extends JpaRepository <Employee, Long> {
	
	public List<Employee> findByName(String name);
}
