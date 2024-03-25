package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGdemos2  extends Setup {

	//TestNG is a framework for writing test cases like JUNIT(framework for writing test cases in java).
	//annotation based framework.
	//@Test annotation is used to mark a method as a test case.
	
	@Test()
	public void test() {
		System.out.println("Testcase4");
	}
//	@Ignore
	@Test(groups="Regression")
	public void test1() {
		System.out.println("Testcase5");
	}
	@Test(groups="Regression")
	public void abc() {
		System.out.println("Testcase6");
	}
	
	

}
