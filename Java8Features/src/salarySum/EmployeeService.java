package salarySum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import salarySum.*;

public class EmployeeService {	
	
	public List<Employee> getEmployeeSort(){
		List<Employee> emps = new EmployeeDao().getModel();
		
		Collections.sort(emps, (o1,o2)-> o1.getSalary().compareTo(o2.getSalary()));
		return emps;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp = new EmployeeService().getEmployeeSort();
		System.out.println(emp.size());
		System.out.println(emp);
		List<Employee> del = new ArrayList<>();
		
		
		
		for(int i=0; i<emp.size();i++) {
			
			for(int j=i+1;j<emp.size();j++) {
				
				if(emp.get(i).getSalary().equals(emp.get(j).getSalary())) {
					//System.out.println(emp.get(j).getName());
					int value = emp.get(i).getSalary()+emp.get(j).getSalary();
					emp.get(i).setSalary(value);
					emp.remove(j);
				//	del.add(emp.get(i));
				}
			}
		}
		System.out.println(emp.size());
		System.out.println(emp);
						
		
	}
	
	

}
