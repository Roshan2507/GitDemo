package testPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void loginTest3()
	{
		System.out.println("Login Test3");
	}
	
	@Test(groups= {"Smoke"})
	public void homeTest3()
	{
		System.out.println("Home Test3");
	}

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
}
