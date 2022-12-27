package mapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDao {
	
	public static List<Person> getAll(){
		
		return Stream.of(
				new Person(101,"Ram","ram@gmail.com","Blr",Arrays.asList("9001926591","8007894003")),
				new Person(102,"Rahul","rahul@gmail.com","Hyd",Arrays.asList("567895","98765")),
				new Person(103,"Abhishek","ab@gmail.com","Blr",Arrays.asList("11111","222222")),
				new Person(104,"Jeevan","jeevan@gmail.com","Hyd",Arrays.asList("8765","4567")),
				new Person(105,"Sreekant","sree@gmail.com","Pune",Arrays.asList("1234","4321")),
				new Person(106,"Dhar","dhar@gmail.com","Kol",Arrays.asList("654321","123456")))
				.collect(Collectors.toList());
	}

}
