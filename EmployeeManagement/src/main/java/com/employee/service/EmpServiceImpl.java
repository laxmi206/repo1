package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.beans.Employee;
import com.employee.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpRepo er;

	@Override
	public int insertIntoDB(Employee e) {
		Employee e1=er.save(e);
		return e1.getEid();
	}

	@Override
	public Employee getEmp(Integer id) {
		Optional<Employee> opt=er.findById(id);
		if(opt.isPresent())
			return opt.get();
		else
			return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		 List<Employee> list=er.findAll();
		return list;
	}

	@Override
	public int updateEmp(Employee e) {
		Employee e1=er.save(e);
		
		return e1.getEid();
	}

	@Override
	public void deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		er.deleteById(id);
	}

}
