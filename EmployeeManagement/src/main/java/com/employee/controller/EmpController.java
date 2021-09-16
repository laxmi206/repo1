package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.beans.Employee;
import com.employee.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	private EmpService es;
	
	@GetMapping("/show")
	public String showMsg() {
		System.out.println("request reached");
		return "hello";
	}
	@PostMapping("/insertemp")
	public int insertEmployee(@RequestBody Employee e) {
		System.out.println(e);
		int id=es.insertIntoDB(e);
		return id;
	}
	@GetMapping("/getemp/{id}")
	public Employee getEmployee(@PathVariable Integer id) {
		System.out.println("id got :"+id);
		Employee e=es.getEmp(id);
		return e;
	}
	@GetMapping("/getall")
	public List<Employee> getAllEmployees(){
		List<Employee> emplist=es.getAllEmp();
		return emplist;
	}
	@PutMapping("/updateEmp")
	public int updateEmployee(@RequestBody Employee e) {
		int id=es.updateEmp(e);
		return id;
	}
	@DeleteMapping("/deleteEmp/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		es.deleteEmp(id);
		System.out.println("Employee deleted");
	}

}
