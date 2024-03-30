package extentreportexample;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ExtentTestNGreportListener.class)
public class SampleTest {

	@Test
	public void testMethod1() {
		assert true;
	}
	@Test
	public void testMethod2() {
		assert false;
	}
}
//report neeed to have screenshot of failed test
//everytime when i run my test file that need generate unique report file