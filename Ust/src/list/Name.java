package list;

import java.util.ArrayList;
import java.util.List;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "S";
		List<String> l1 = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		list.add("Sumit");
		list.add("Ram");
		list.add("Arun");
		list.add("Sagar");
		list.add("Manish");
		for(String s:list) {
			if(s.startsWith(a)) {
				l1.add(s);
			}
		}
		
		System.out.println(l1);

	}

}
