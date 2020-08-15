package tests;

import org.testng.annotations.Test;

public class Invocation {
	
	
	@Test(invocationCount=3)
	public void createUserTest() {
		System.out.println("create user...");
	}

	@Test(invocationCount=5)
	public void createUserTest2() {
		System.out.println("create user2...");
	}
}
