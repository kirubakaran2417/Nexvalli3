package collectionsdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		// How to create a set
		// 1. Using new keyword
		// Set<data type> set = new HashSet<data type>();
		// Set<data type> set = new LinkedHashSet<data type>();
		// create an object of the non generic set
		// Set set = new HashSet();
		// set.add("A");
		// set.add("B");
		// set.add(20);
		// set.add("A");
		// set.add(null);
		
		ArrayList<String> list = new ArrayList();
		list.add("monday");
		list.add("tuesday");
		list.add("wednesday");
		list.add("thursday");
		list.add("friday");
		list.add("monday");
		list.add("tuesday");
		System.out.println(list);
		
		
		HashSet<String> set = new HashSet();
		set.addAll(list);
		System.out.println(set);
		
		Set<Integer> set1 = new HashSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(set1);
		
	}
}
