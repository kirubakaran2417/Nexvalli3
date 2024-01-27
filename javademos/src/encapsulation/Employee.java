package encapsulation;

public class Employee {

	//private variables
	private String name;
	private int age;
	private double salary;

	//getters and setters
	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getSalary() {
		return salary;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
