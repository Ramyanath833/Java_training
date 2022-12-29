package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayOfInteger {

	public static void main(String[] args) {
		

		List<Integer> list = Arrays.asList(2, 4, 5, 6);
		int sum = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum);
		
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		int sum1 = numberList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum1);
		
		
		
		
		
		
		
		
	}

}
