package tests;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	//dependsOnMethod
	
	@Test(priority=1)  //main method parent
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(priority=2, dependsOnMethods="loginTest")  //child
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test(priority=3, dependsOnMethods="homePageTest")
	public void searchPageTest() {
		System.out.println("search page test");
	}

}
