package com.simplilearn.models.session.daopattern.models;

public class Employee {

	String EmployeeName;
	int EmployeeId;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId,String employeeName) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + "]";
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int EmployeeId) {
		this.EmployeeId = EmployeeId;
	}

}
