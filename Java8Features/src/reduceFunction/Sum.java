package reduceFunction;

import java.util.List;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		var v = List.of(1,2,3,4,5,6,7,8,9,10);
		var sum = v.stream().filter(a->a%2!=0).reduce(0,(num1,num2)->num1+num2);
		System.out.println(sum);
	}

}
