package entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link entity.Region}
 **/
@StaticMetamodel(Region.class)
public abstract class Region_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #regname
	 **/
	public static final String REGNAME = "regname";

	
	/**
	 * Static metamodel type for {@link entity.Region}
	 **/
	public static volatile EntityType<Region> class_;
	
	/**
	 * Static metamodel for attribute {@link entity.Region#id}
	 **/
	public static volatile SingularAttribute<Region, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link entity.Region#regname}
	 **/
	public static volatile SingularAttribute<Region, String> regname;

}

