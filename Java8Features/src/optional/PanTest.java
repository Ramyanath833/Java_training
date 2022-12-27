package optional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import optional.Employee;

public class PanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> emp = new ArrayList();
		emp.addAll((Collection<? extends Employee>) new EmployeePan(1001,"Ram","Blr",58000.0,"ASDFR1234E"));
		emp.addAll((Collection<? extends Employee>) new EmployeePan(1001,"Jeeban","Hyd",51000.0,"HGRTE3245F"));
		emp.addAll((Collection<? extends Employee>) new EmployeePan(1001,"Pratik","Blr",59000.0,"HGFT23456R"));
		emp.addAll((Collection<? extends Employee>) new EmployeePan(1001,"Abhishek","Hyd",25000.0,"23456TFRG5"));
		
		

	}

}
