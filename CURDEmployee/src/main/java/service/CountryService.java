package service;

import java.util.List;

import app.HibernateUtil;
import entity.Country;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CountryService 
{
	 public void saveCountry(Country country) {
	        EntityTransaction transaction = null;
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            transaction = entityManager.getTransaction();
	            transaction.begin();
	            entityManager.persist(country);
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public List<Country> getAllCountries() {
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            return entityManager.createQuery("FROM Country", Country.class).getResultList();
	        }
	    }

	    public void updateCountry(int countryId, String newName) {
	        EntityTransaction transaction = null;
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            transaction = entityManager.getTransaction();
	            transaction.begin();
	            Country country = entityManager.find(Country.class, countryId);
	            if (country != null) {
	                country.setCountryname(newName);
	                entityManager.merge(country);
	            }
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteCountry(int countryId) {
	        EntityTransaction transaction = null;
	        try (EntityManager entityManager = HibernateUtil.getEntityManagerFactory().createEntityManager()) {
	            transaction = entityManager.getTransaction();
	            transaction.begin();
	            Country country = entityManager.find(Country.class, countryId);
	            if (country != null) {
	                entityManager.remove(country);
	            }
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


