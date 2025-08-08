package lab7.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prg1 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Keshav");
		list.add("Ankit");
		list.add("Rahul");
		list.add("Mohit");
		
		Collections.sort(list);
		
		System.out.println(list);
		
		for(String str: list) {
			System.out.print(str+", ");
		}
	}

}


//  Write a program to store product names in a string array and sort strings available in an array.