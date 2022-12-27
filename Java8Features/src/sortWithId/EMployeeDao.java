package sortWithId;

import java.util.ArrayList;
import java.util.List;

public class EMployeeDao {

	
	public List<Employee> getModel(){
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(106, "Ram"));
		emp.add(new Employee(105, "Rahul"));
		emp.add(new Employee(102, "Jeevan"));
		emp.add(new Employee(103, "Pratik"));
		emp.add(new Employee(104, "Asish"));
		
		return emp;
		
	}
	
}
