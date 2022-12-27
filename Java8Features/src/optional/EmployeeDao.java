package optional;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public List<Employee> getModel() {
		
		List<Employee> emp = new ArrayList();
		emp.add(new Employee(1001,"Ram","Blr",58000.0));
		emp.add(new Employee(1001,"Jeeban","Hyd",51000.0));
		
		return emp;
	}
	
	public List<Employee> getModelDemo() {
		
		List<Employee> emp = new ArrayList();
		
		return emp;
	}

}
