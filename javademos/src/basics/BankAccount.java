package basics;

public class BankAccount {

	String accountHolderName;
	int accountNumber;
	double accountBalance;
	
	public BankAccount(String name,int number,double balance) {
		//initialize the attributes with the provided values
		accountHolderName=name;
		accountNumber=number;
		accountBalance=balance;
	}
	
	public static BankAccount createAccount(String name,int number,double balance) {
		BankAccount b=new BankAccount(name,number,balance);
		return b;
	}
	
	public static void deposit(BankAccount account,double amount) {
		//update the account balance by adding the deposit amount
		account.accountBalance=account.accountBalance+amount;
		System.out.println("Deposited "+amount+" successfully!!!");
		
	}
	public static void withdraw(BankAccount account,double amount) {
		//check if there are sufficient funds for withdrawl
		if(amount<=account.accountBalance) {
			account.accountBalance=account.accountBalance-amount;
			System.out.println("withdrawn "+amount+" successfully!!!");
		}
		else {
			System.out.println("Insufficient funds.....");
		}
	}
	
	public static void display(BankAccount account) {
		System.out.println("Account Holder: "+account.accountHolderName);
		System.out.println("Account number: "+account.accountNumber);
		System.out.println("Account balance: "+account.accountBalance);
	}
	
	public static void main(String[] args) {
		//BankAccount myAccount =new BankAccount("aabreeq", 123456789, 1000.00);
		//Alternatively
		BankAccount myAccount =BankAccount.createAccount("aabreeq", 123456789, 1000.00);
		BankAccount.deposit(myAccount, 500.00);
		BankAccount.withdraw(myAccount, 200.00);
		BankAccount.display(myAccount);
	}
}
