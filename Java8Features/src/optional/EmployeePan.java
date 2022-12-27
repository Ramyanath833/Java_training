package optional;

public class EmployeePan {
	
	private int ustId;
	private String name;
	private String location;
	private double salary;
	private String pan;
	
	public EmployeePan(int ustId, String name, String location, double salary, String pan) {
		this.ustId = ustId;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.pan = pan;
	}
	
	public EmployeePan() {
		
	}
	
	public int getUstId() {
		return ustId;
	}
	public void setUstId(int ustId) {
		this.ustId = ustId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "EmployeePan [ustId=" + ustId + ", name=" + name + ", location=" + location + ", salary=" + salary
				+ ", pan=" + pan + "]";
	}
	
	

}
