package com.example.demo.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	EntityManager entityManager;

	@Override
	public List<Employee> findAll() 
	{
		
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		Query <Employee> query = currentSession.createQuery("from Employee",Employee.class);
		
		List<Employee> emplist = query.getResultList();
		
		return emplist;
	}

	@Override
	public Employee findById(int id) {
		Session CurrentSession = entityManager.unwrap(Session.class);
		return CurrentSession.get(Employee.class, id);
	}

	@Transactional
	@Override
	public void save(Employee e)
	{
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(e);		
	}
	
	@Transactional
	@Override
	public void saveOrUpdate(Employee e) 
	{
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(e);
		
	}

	@Transactional
	@Override
	public void deleteById(int id) 
	{
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("delete from Employee where id=:employeeid");
		query.setParameter("employeeid",id);
		query.executeUpdate();
		
	}
	
	
	
	

}
