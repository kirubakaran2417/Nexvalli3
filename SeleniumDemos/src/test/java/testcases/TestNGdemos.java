package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGdemos extends Setup {

	//TestNG is a framework for writing test cases like JUNIT(framework for writing test cases in java).
	//annotation based framework.
	//@Test annotation is used to mark a method as a test case.
	
	@Test(priority=1,groups="Regression")
	public void test() {
		System.out.println("Testcase1");
	}
//	@Ignore
	@Test()
	public void test1() {
		System.out.println("Testcase2");
	}
	@Test()
	public void abc() {
		System.out.println("Testcase3");
	}
	
	

}
