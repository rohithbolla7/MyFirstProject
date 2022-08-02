package com.example.demo.contoller;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeContollerInterface
{
	public List<Employee> findAll();
	public Employee findById(int id);
	public Employee save(Employee e);
	public Employee saveOrUpdate(Employee e);
	public void deleteById(int id);
}
