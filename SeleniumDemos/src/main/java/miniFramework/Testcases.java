package miniFramework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testcases {

	
	public int add() {
		return 7+8;
	}
	
	@Test
	public void test() {
		assertEquals(14, add());
	}
}
