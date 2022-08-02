package com.example.demo.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	EmployeeDao employeedao;
	
	@Override
	@Transactional
	public List<Employee> findAll() 
	{
		// TODO Auto-generated method stub
		return employeedao.findAll();
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeedao.findById(id);
	}

	@Override
	public void save(Employee e)
	{
		// TODO Auto-generated method stub
		employeedao.save(e);
		
	}

	@Override
	public void saveOrUpdate(Employee e) {
		// TODO Auto-generated method stub
		employeedao.saveOrUpdate(e);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeedao.deleteById(id);
		
	}

	

}
