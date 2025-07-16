package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
@Entity
@Table(name="regiondetails")
public class Region
{
	@Id
  private int id;
	@Column(name = "region_name")
    private String regname;
	public Region(int id, String regname) {
		super();
		this.id = id;
		this.regname = regname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRegname() {
		return regname;
	}
	public void setRegname(String regname) {
		this.regname = regname;
	}

	
}
