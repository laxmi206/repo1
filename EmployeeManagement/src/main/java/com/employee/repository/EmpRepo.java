package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.beans.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
