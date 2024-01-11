package testNG;

import org.testng.annotations.Test;

public class TestMethodOrder {

	@Test(priority = 1)
	public void xyz() {
		System.out.println("xyz method");
	}
	@Test(priority = 2,enabled = false)
	public void abc() {
		System.out.println("abc method");
	}
	@Test(priority = 3)
	public void rst() {
		System.out.println("rst method");
	}
}
