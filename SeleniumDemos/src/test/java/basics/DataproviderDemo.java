package basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo {


//	//static method to return data
//	public static String[][] getData() {
//	   String[][] data = {
//			   {"admin", "admin"},
//			   {"admin", "admin"},
//	   };
//	   return data;
//	}
	
	//what is data provider
	// Data provider is a TestNG annotation used to supply test data to test methods.
	//It allows passing parameters to test methods.
	@DataProvider(name="data")
	public String[][] getData(){
		String[][] data = {
				{"admin1", "admin123"},
				{"admin2", "admin123"},
		};
		return data;
	}
	
	@Test(dataProvider="data")
	public void test(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
}
