package pfStucture;

public class Employee {
	
	private int ustId;
	private String name;
	private String location;
	private double salary;
	private double inHandSalary;
	
	
	public Employee(int ustId, String name, String location, double salary, double inHandSalary) {
		
		this.ustId = ustId;
		this.name = name;
		this.location = location;
		this.salary = salary;
		this.inHandSalary = inHandSalary;
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
	public double getInHandSalary() {
		return inHandSalary;
	}
	public void setInHandSalary(double inHandSalary) {
		this.inHandSalary = inHandSalary;
	}
	@Override
	public String toString() {
		return "Employee [ustId=" + ustId + ", name=" + name + ", location=" + location + ", salary=" + salary
				+ ", inHandSalary=" + inHandSalary + "]";
	}
	
	
	
	
	

}
