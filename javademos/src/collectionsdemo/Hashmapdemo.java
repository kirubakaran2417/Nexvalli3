package collectionsdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hashmapdemo {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		//create hashmap
		HashMap<Integer, String> languages = new HashMap<>();
		//add elements to hashmap
		languages.put(9, "Java");
		languages.put(10, "Python");
		languages.put(7, "C++");
		languages.put(8, "C");
		languages.put(11, "Ruby");
		languages.put(12, "JavaScript");
		System.out.println(languages);
		languages.put(8, "kotlin");//updating the map
		System.out.println(languages);
		//removing an element
		languages.remove(8);
		System.out.println(languages);
		HashMap<Integer, String> languages1 = new HashMap<Integer, String>(languages);
		
		System.out.println(languages.size());	
		//create for loop for iterate through keys
		for(int key:languages.keySet()) {
			System.out.println(key);
		}
		
		//create for loop for iterate through values
		for(String value:languages.values()) {
			System.out.println(value);
		}
		
		//create the loop to iterate through keys and values
		for(HashMap.Entry<Integer, String> entry:languages.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//create a hashmap with set as keys and list as values
		HashMap<Set<String>, List<String>> map = new HashMap<>();
		//add 5 elements to hashmap 'map'
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("Python");
		set.add("C++");
		set.add("C");
		List<String> list1 = new ArrayList<>();
		list1.add("oop");
		list1.add("scripting languages");
		list1.add("functional programming");
		list1.add("web development");
		
		map.put(set, list1);
		
		
		
	}
}
