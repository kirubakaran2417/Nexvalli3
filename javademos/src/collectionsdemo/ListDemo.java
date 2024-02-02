package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		//How to create a list
		//1.Using new keyword
        //List<data type> list = new ArrayList<data type>();
		//List<data type> list = new LinkedList<data type>();
		//create an object of the non generic arraylist
		List list = new ArrayList();
		list.add("A");
		list.add("B");
		list.add(20);
		list.add("A");
		list.add(null);
		System.out.println(list);
		
		ArrayList list1 = new ArrayList();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		//call addall method
		
		list.addAll(list1);
		System.out.println(list);
		
		list1.addAll(1, list);
	}
}
