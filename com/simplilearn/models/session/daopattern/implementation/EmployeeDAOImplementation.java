package com.simplilearn.models.session.daopattern.implementation;

import java.util.ArrayList;
import java.util.List;

import com.simplilearn.models.session.daopattern.contract.EmployeeDAO;
import com.simplilearn.models.session.daopattern.models.Employee;

public class EmployeeDAOImplementation implements EmployeeDAO {

	List<Employee> employees; 
	
	public EmployeeDAOImplementation() {
		employees = new ArrayList<Employee>();
		employees.add(new Employee(101,"King"));
		employees.add(new Employee(102,"John"));
		employees.add(new Employee(103,"Kochar"));
		employees.add(new Employee(104,"Sarah"));
		employees.add(new Employee(105,"Bowling"));
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employees;
	}

	@Override
	public Employee getEmployee(int empid) {
		return employees.get(empid);
	}

	@Override
	public void updateEmployee(Employee employee) {
		if(employees.contains(employee)) {
			employees.get(employee.getEmployeeId()).setEmployeeName(employee.getEmployeeName());
			System.out.println(employee + " successfully updated");
		}
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employees.remove(employee);
		System.out.println(employee + " successfully removed");
	}

}
