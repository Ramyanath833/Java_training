package pfStucture;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public List<Employee> getModel() {
		
		List<Employee> emp = new ArrayList();
		emp.add(new Employee(1001,"Ram","Blr",20000.0,0.0));
		emp.add(new Employee(1001,"Jeeban","Hyd",30000.0,0.0));
		emp.add(new Employee(1001,"Pratik","Blr",60000.0,0.0));
		emp.add(new Employee(1001,"Abhishek","Hyd",90000.0,0.0));
		
		
		
		return emp;
	}

}
