package salarySum;

public class Employee {
	
	private int ustId;
	private String name;
	private String location;
	private Integer salary;
	
	
	
	public Employee(int ustId, String name, String location, Integer salary) {
		
		this.ustId = ustId;
		this.name = name;
		this.location = location;
		this.salary = salary;
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
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [ustId=" + ustId + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
	
	

}
