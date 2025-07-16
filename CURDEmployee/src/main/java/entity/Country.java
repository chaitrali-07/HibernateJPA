package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name = "countrydetails")
public class Country
{
  @Id
  private int id;
  @Column(name = "county_name")
  private String countryname;
  @Column(name = "capital")
  private String countrycapital;
  public Country(int id, String countryname, String countrycapital) {
	super();
	this.id = id;
	this.countryname = countryname;
	this.countrycapital = countrycapital;
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getCountryname() {
	return countryname;
  }
  public void setCountryname(String countryname) {
	this.countryname = countryname;
  }
  public String getCountrycapital() {
	return countrycapital;
  }
  public void setCountrycapital(String countrycapital) {
	this.countrycapital = countrycapital;
  }
  
}
