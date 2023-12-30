package basics;

public class Person {

	String name;
	int age;
	String city;
	String gender;
	
	public void eat() {
		System.out.println("Eating");
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "John";
		person1.age = 25;
		person1.city = "New York";
		person1.gender = "Male";
		System.out.println(person1.name+" "+person1.age+" "+person1.city+" "+person1.gender);
		
		Person person2 = new Person();
		person2.name = "Jane";
		person2.age = 30;
		person2.city = "London";
		person2.gender = "Female";
		System.out.println(person2.name+" "+person2.age+" "+person2.city+" "+person2.gender);
	}
	
}
