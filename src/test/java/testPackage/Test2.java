package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void homeTest2()
	{
		System.out.println("Home Test2");
	}
	
	@Test(groups= {"Smoke"})
	public void loginTest2()
	{
		System.out.println("Login Test2");
	}
	@BeforeTest
	public void prerequisites()
	{
		System.out.println("clear all previous data");
	}
	
	@AfterTest
	public void lastExecution()
	{
		System.out.println("last test execution");
	}

}
