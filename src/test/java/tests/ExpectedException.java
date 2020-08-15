package tests;

import org.testng.annotations.Test;

public class ExpectedException {
	
	@Test(expectedExceptions=ArithmeticException.class )
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
		System.out.println(i);
	}

}
