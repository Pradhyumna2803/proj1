package com.firstpackage;

public class Employee {

	Employee() {
		System.out.println("default constructor");
	}

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		System.out.println("paremeterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public void showDetails(Employee e) {
		System.out.println("The details of the employee is as follows:  ");
		System.out.println("Employee id "+e.id);
		System.out.println("Name  "+e.name);
		System.out.println("Salary  "+e.salary);
	}

}