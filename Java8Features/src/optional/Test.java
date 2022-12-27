package optional;

import java.util.List;
import java.util.Optional;

import optional.Employee;
import optional.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="kiran";
        Optional<String> optionalString=Optional.ofNullable(str);
        System.out.println(optionalString.isPresent());
        optionalString.ifPresent(value->{
            System.out.println(value);
        });
        
        
        
        List<Employee> emps = new EmployeeDao().getModel();
        Optional<List<Employee>> optionalString1=Optional.ofNullable(emps);
        System.out.println(optionalString1.isPresent());
        optionalString1.ifPresent(value->{
            System.out.println(value);
        });
        
	}

}
