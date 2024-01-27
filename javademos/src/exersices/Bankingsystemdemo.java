package exersices;

public class Bankingsystemdemo {

	public static void main(String[] args) {
		
		Account a = new Account("1234", "John", 1000);
		
		Bank b = new Bank();
		b.setCurrentAccount(a);
		b.updateBalance(2000);
		System.out.println(b.getCurrentAccount().getBalance());
		
	}
}
