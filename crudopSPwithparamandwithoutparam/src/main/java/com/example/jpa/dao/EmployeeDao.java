package com.example.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.jpa.entites.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EntityManager eManager;
	
	// store procedure 
	// this method return all data from table
	@SuppressWarnings("unchecked")
	public List<Employee> getList()
	{
		return eManager.createNamedStoredProcedureQuery("getAllEmpl").getResultList();
	}
//
//	public int getList() {
//		// TODO Auto-generated method stub
//		return eManager.createNamedStoredProcedureQuery("getAllEmpl").getFirstResult();
//	}

	@SuppressWarnings("unchecked")
	public List<Employee> getByIdEmployees(String id) {
		return eManager.createNamedStoredProcedureQuery("GetById").setParameter("id", id).getResultList();
		
	}
}

