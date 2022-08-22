package dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="employee")
public class Employee {
	//Atributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="work")
	private String work;
	@Column(name="salary")
	private int salary;
	
	// Constructors
	public Employee() {

	}

	/**
	 * @param id
	 * @param name
	 * @param surname
	 * @param trabajo
	 * @param salario
	 */
	
	public Employee(Long id, String name, String surname, String work, int salary) {
		//super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.work = work;
		this.salary = salary;
	}

	// Getters setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// To string
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", name=" + name + ", surname=" + surname + ", work=" + work
				+ ", salary=" + salary + "]";
	}

}
