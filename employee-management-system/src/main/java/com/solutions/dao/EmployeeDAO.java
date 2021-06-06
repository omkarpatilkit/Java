package com.solutions.dao;

import com.solutions.beans.Employee;

public interface EmployeeDAO {

	Employee findEmployeeById(Integer id);

	Employee findEmployeeByName(String name);

}
