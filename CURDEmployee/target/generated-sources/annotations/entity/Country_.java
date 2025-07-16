package entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link entity.Country}
 **/
@StaticMetamodel(Country.class)
public abstract class Country_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #countryname
	 **/
	public static final String COUNTRYNAME = "countryname";
	
	/**
	 * @see #countrycapital
	 **/
	public static final String COUNTRYCAPITAL = "countrycapital";

	
	/**
	 * Static metamodel type for {@link entity.Country}
	 **/
	public static volatile EntityType<Country> class_;
	
	/**
	 * Static metamodel for attribute {@link entity.Country#id}
	 **/
	public static volatile SingularAttribute<Country, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link entity.Country#countryname}
	 **/
	public static volatile SingularAttribute<Country, String> countryname;
	
	/**
	 * Static metamodel for attribute {@link entity.Country#countrycapital}
	 **/
	public static volatile SingularAttribute<Country, String> countrycapital;

}

