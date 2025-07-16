package service;

import java.util.List;

import app.HibernateUtil;
import entity.Region;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class RegionService 
{
	 public void saveRegion(Region region) {
	        EntityTransaction transaction = null;
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            transaction = entityManager.getTransaction();
	            transaction.begin();
	            entityManager.persist(region);
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public List<Region> getAllRegions() {
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            return entityManager.createQuery("FROM Region", Region.class).getResultList();
	        }
	    }

	    public void updateRegion(int regionId, String newName) {
	        EntityTransaction transaction = null;
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            transaction = entityManager.getTransaction();
	            transaction.begin();
	            Region region = entityManager.find(Region.class, regionId);
	            if (region != null) {
	                region.setRegname(newName);
	                entityManager.merge(region);
	            }
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteRegion(int regionId) {
	        EntityTransaction transaction = null;
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            transaction = entityManager.getTransaction();
	            transaction.begin();
	            Region region = entityManager.find(Region.class, regionId);
	            if (region != null) {
	                entityManager.remove(region);
	            }
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
