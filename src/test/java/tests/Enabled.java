package tests;

import org.testng.annotations.Test;

public class Enabled {

	
	// enabled == return ---> true or false
	
	@Test(priority=1, description= "atest", enabled=true)
	public void aTest() {
		System.out.println("aTest");
	}
	
	@Test(priority=3, description="btest", enabled=true)
	public void bTest() {
		System.out.println("bTest");
	}
	
	@Test(priority=2, description="ctset", enabled=true)
	public void cTest() {
		System.out.println("cTest");
	}
	
	@Test(priority=4, description="dtset", enabled=true)
	public void dTest() {
		System.out.println("dTest");
	}
	
	
}
