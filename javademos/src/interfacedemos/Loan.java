package interfacedemos;

public class Loan implements Home,Car,Education {

	@Override
	public void eduloan() {
		System.out.println("Rate of interest on edu loan is 7.5%");
		
	}

	@Override
	public void carloan() {
		System.out.println("Rate of interest on car loan is 8.5%");
		
	}

	@Override
	public void homeloan() {
		System.out.println("Rate of interest on home loan is 9.5%");
		
	}

}
