package com.simplilearn.models.session.daopattern;

import com.simplilearn.models.session.daopattern.implementation.EmployeeDAOImplementation;
import com.simplilearn.models.session.daopattern.models.Employee;

public class DAOPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDAOImplementation obj = new EmployeeDAOImplementation();
		for(Employee emp: obj.getAllEmployees()) {
			System.out.println(emp);
		}
		
		System.out.println("---------------------------------");
		
		Employee empobj = obj.getEmployee(0);
		empobj.setEmployeeName("Vamsi");
		obj.updateEmployee(empobj);
		for(Employee emp: obj.getAllEmployees()) {
			System.out.println(emp);
		}
		
		System.out.println("---------------------------------");
		for(Employee emp: obj.getAllEmployees()) {
			System.out.println(emp);
		}
	}

}
