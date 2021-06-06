package com.solutions.main;

import java.util.Scanner;

import com.solutions.beans.Employee;
import com.solutions.dao.EmployeeDAO;
import com.solutions.dao.EmployeeDAOImpl;

public class EmployeeManagementSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		EmployeeDAO employeeDAO = new EmployeeDAOImpl();
		boolean flag = true;

		do {

			System.out.println("----- Employee Management System -----");
			System.out.println("Enter 1: Search Employee By Id		2: Search Employee By Name");
			Integer option = scanner.nextInt();

			switch (option) {
			case 1:
				System.out.println("----- Search Employee By Id -----");
				System.out.println("Please Enter Employee Id:");
				Integer id = scanner.nextInt();
				Employee employee = employeeDAO.findEmployeeById(id);
				System.out.println(employee);
				break;

			case 2:
				System.out.println("----- Search Employee By Name -----");
				System.out.println("Please Enter Employee Name:");
				String name = scanner.next();
				Employee employee2 = employeeDAO.findEmployeeByName(name);
				System.out.println(employee2);

			default:
				System.out.println("Please Enter valid options:");
				break;
			}

			System.out.println();
			System.out.println("Do you want to continue?");
			System.out.println("Enter 1: Continue		Any Number: Exit");
			Integer choice = scanner.nextInt();

			switch (choice) {
			case 1:
				flag = true;
				break;

			default:
				flag = false;
				break;
			}
		} while (flag);
		System.out.println("Logout successful...");
		scanner.close();
	}
}
