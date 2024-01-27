package exersices;

public class Bank {

	       private Account currentAccount;

		public Account getCurrentAccount() {
			return currentAccount;
		}

		public void setCurrentAccount(Account currentAccount) {
			this.currentAccount = currentAccount;
		}
	       
	     public void updateBalance(double newBalance) {
		     if (currentAccount != null) {
		    	 currentAccount.setBalance(newBalance);
		     }else {
			     System.out.println("Account not found");
		     }
	     }
}
