package com.solutions.dao;

import java.util.ArrayList;
import java.util.List;

import com.solutions.beans.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private List<Employee> employeeData() {

		Employee employee = new Employee(1001, "Sourabh", 12514f);
		Employee employee2 = new Employee(1002, "Omkar", 23452f);
		Employee employee3 = new Employee(1003, "Shubham", 33452f);
		Employee employee4 = new Employee(1004, "Rajkiran", 43273f);

		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(employee);
		employeesList.add(employee2);
		employeesList.add(employee3);
		employeesList.add(employee4);
		return employeesList;
	}

	public Employee findEmployeeById(Integer id) {

		for (Employee employee : employeeData()) {
			if (employee.getId().equals(id)) {
				return employee;
			}
		}
		System.out.println("[INFO] Employee Not Found for given Id: " + id);
//		throw new EmployeeNotFoundException("Employee Not Found for given Id: " + id);
		return new Employee();
	}

	public Employee findEmployeeByName(String name) {

		for (Employee employee : employeeData()) {
			if (employee.getName().equalsIgnoreCase(name)) {
				return employee;
			}
		}
		System.out.println("[INFO] Employee Not Found for given Name: " + name);
//		throw new EmployeeNotFoundException("Employee Not Found for given Name: " + name);
		return new Employee();
	}

}
