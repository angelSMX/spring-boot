package argl.io.alsea.data;

import java.io.Serializable;

public class Superhero implements Serializable{
	
	

	private static final long serialVersionUID = 1L;
	
	
	
	private Integer id;
    private String name;
    private String firstname;  
    private String lastname;  
    private String place;
    
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}  

}
