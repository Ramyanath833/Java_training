package mapVsFlatMap;

import java.util.List;

public class Person {
	
	private int id;
	private String name;
	private String email;
	private String location;
	private List<String> phoneNumber;
	
	
	
	public Person() {
		
	}
	public Person(int id, String name, String email, String location, List<String> phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.location = location;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", location=" + location + ", phoneNumber="
				+ phoneNumber + "]";
	}
	
	
	

}
