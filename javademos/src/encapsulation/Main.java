package encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Aabreeq");
		e1.setAge(22);
		e1.setSalary(23456.00);
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
	}
}
