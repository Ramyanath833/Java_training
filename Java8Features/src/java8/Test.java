package java8;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Sim e = new Airtel();
	//	e.calling();
	//	e.data();
	//	e.payment(); 
		
		String inputString;

        //2
        Scanner scanner = new Scanner(System.in);

        //3
        int count;

        //4
        System.out.println("Enter a string : ");

        //5
        inputString = scanner.nextLine();

        //6
        String[] wordsArray = inputString.split("\\s+");

        //7
        HashMap<String, Integer> map = new HashMap<>();

        //8
        for (String word : wordsArray) {
            //9
            if (map.containsKey(word)) {
                count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }

        //10
        for (Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

	}

}
