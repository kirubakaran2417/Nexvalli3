package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		//create a generic arraylist object of string type
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add(null);
		list.add("d");
		System.out.println(list);
		
		list.remove("d");
		
		list.set(3, null);
		System.out.println(list);
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("apple");
		list1.add("banana");
		list1.add("orange");
		list1.add("mango");
		System.out.println(list1);
		
		String str = list1.get(3);
		System.out.println(	str);
	
		boolean b = list1.contains("mango");
		System.out.println(b);
		
		int size = list1.size();
		System.out.println(size);
		
		int pos = list1.indexOf("mango");
		System.out.println(pos);

		//create iterator object of string type
		Iterator<String> iterator = list1.iterator();
		//checking the availablity of next element in the list using hasNext
		while(iterator.hasNext()) {
			//moving the cursor to next element using reference variable iterator
			String str1 = iterator.next();
			System.out.println(str1);	
		}
		
		//creating for loop to iterate through the list
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		//creating for each loop
		for(String str2:list1) {
			System.out.println(str2);
		}
	}
}
