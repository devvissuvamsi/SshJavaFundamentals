package com.simplilearn.models.session.daopattern.contract;

import java.util.List;
import com.simplilearn.models.session.daopattern.models.Employee;

public interface EmployeeDAO {
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int empid);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(Employee emmployee);
}
