package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> consumer = t -> System.out.println("print the value "+t);
		consumer.accept(50);
		
		Supplier<String> supplier= ()-> "Arpit";
		  System.out.println(supplier.get());
		  
		  List<String> sList = new ArrayList<String>();
	        sList.add("string1");
	        sList.add("string2");
	        sList.add("Ram");
	        
	        sList.stream().forEach((name) -> {
	        	print(() -> name);
	        });
	}
	        
	        public static void print(Supplier<String> sup) {
	        	System.out.println(sup.get());
	        }

	}


