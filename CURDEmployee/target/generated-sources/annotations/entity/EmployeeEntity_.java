package entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.util.Date;

/**
 * Static metamodel for {@link entity.EmployeeEntity}
 **/
@StaticMetamodel(EmployeeEntity.class)
public abstract class EmployeeEntity_ {

	
	/**
	 * @see #emp_id
	 **/
	public static final String EMP_ID = "emp_id";
	
	/**
	 * @see #firstName
	 **/
	public static final String FIRST_NAME = "firstName";
	
	/**
	 * @see #lastName
	 **/
	public static final String LAST_NAME = "lastName";
	
	/**
	 * @see #email
	 **/
	public static final String EMAIL = "email";
	
	/**
	 * @see #hireDate
	 **/
	public static final String HIRE_DATE = "hireDate";

	
	/**
	 * Static metamodel type for {@link entity.EmployeeEntity}
	 **/
	public static volatile EntityType<EmployeeEntity> class_;
	
	/**
	 * Static metamodel for attribute {@link entity.EmployeeEntity#emp_id}
	 **/
	public static volatile SingularAttribute<EmployeeEntity, Integer> emp_id;
	
	/**
	 * Static metamodel for attribute {@link entity.EmployeeEntity#firstName}
	 **/
	public static volatile SingularAttribute<EmployeeEntity, String> firstName;
	
	/**
	 * Static metamodel for attribute {@link entity.EmployeeEntity#lastName}
	 **/
	public static volatile SingularAttribute<EmployeeEntity, String> lastName;
	
	/**
	 * Static metamodel for attribute {@link entity.EmployeeEntity#email}
	 **/
	public static volatile SingularAttribute<EmployeeEntity, String> email;
	
	/**
	 * Static metamodel for attribute {@link entity.EmployeeEntity#hireDate}
	 **/
	public static volatile SingularAttribute<EmployeeEntity, Date> hireDate;

}

