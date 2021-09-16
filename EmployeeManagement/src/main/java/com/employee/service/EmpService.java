package com.employee.service;

import java.util.List;

import com.employee.beans.Employee;

public interface EmpService {

	public int insertIntoDB(Employee e);

	public Employee getEmp(Integer id);

	public List<Employee> getAllEmp();

	public int updateEmp(Employee e);

	public void deleteEmp(Integer id);

}
