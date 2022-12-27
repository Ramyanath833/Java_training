package mapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> person = PersonDao.getAll();
		
		List<List<String>> email = person.stream()
									.map(person1 ->person1.getPhoneNumber())
									.collect(Collectors.toList());
		System.out.println(email);
		
		List<String> flatMap = person.stream().flatMap(person1 ->person1.getPhoneNumber().stream())
				.collect(Collectors.toList());
		System.out.println(flatMap);

	}

}
