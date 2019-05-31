package MappingRealtionship;
import javax.persistence.*;

@Entity
@Table(name = "RAddress1")
public class Address {

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@Id 
	private int id;
	private String street;
	private String city;
	
	@OneToOne
	private User user;
	
	public Address() {}
	
	public Address(int id, String street, String city) {
		this.id = id;
		this.street = street;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
