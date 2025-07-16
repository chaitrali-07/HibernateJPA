package service;

import java.util.List;

import app.HibernateUtil;
import entity.EmployeeEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EmployeeService 
{
	public void saveEmployee(EmployeeEntity employee) {
		EntityTransaction transcation=null;
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			transcation=entityManager.getTransaction();
			entityManager.persist(employee);
			transcation.commit();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public List<EmployeeEntity> getAllEmployee(){
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			return entityManager.createQuery("from EmployeeEntity",EmployeeEntity.class).getResultList();
		}
	}
	
	public void updateEmp(int empId,String new_lastname) {
		EntityTransaction transcation=null;
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			transcation=entityManager.getTransaction();
			EmployeeEntity e= entityManager.find(EmployeeEntity.class,empId);
			if(e!=null) {
				e.setLastName(new_lastname);
				entityManager.merge(e);
			}
			transcation.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
	public void deleteEmp(int empId) {
		EntityTransaction transcation=null;
		try(EntityManager entityManager =HibernateUtil.getEntityManagerFactory().createEntityManager();){
			transcation=entityManager.getTransaction();
			EmployeeEntity emp=entityManager.find(EmployeeEntity.class,empId);
			if(emp!=null) {
				entityManager.remove(emp);
			}
			transcation.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}

	
}
