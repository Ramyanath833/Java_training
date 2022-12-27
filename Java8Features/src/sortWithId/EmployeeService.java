package sortWithId;

import java.util.List;

public class EmployeeService {
	
	public static void main(String[] args) {
		
		List<Employee> emp = new EMployeeDao().getModel();
		
		
		for(int a = 0; a < emp.size(); a++)
	      {
	         for(int b = a+1; b < emp.size(); b++)
	         {
	            if(emp.get(a).getId() < emp.get(b).getId())
	            {
	               
	               int element = emp.indexOf(a);
	               int ndelement = emp.indexOf(b);
	               emp.set(element, emp.get(b));
	               emp.set(ndelement, emp.get(a));
	            }
	         }
	      }
		
		System.out.println(emp);
	}

}
