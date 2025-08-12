package testPackage;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(dataProvider="getData")
	public void homePage(String user,String pass)
	{
		System.out.println("HomePage");
		System.out.println(user);
		System.out.println(pass);
	}
	@Parameters({"URL"})
	@Test(groups= {"Smoke"})
	public void loginPage(String url)
	{
		System.out.println("LoginPage");
		System.out.println(url);
		
		String st1="roshan";
		String str2="rathod";
		
		Assert.assertTrue(st1.equals(str2));
		
	}
	
	@DataProvider
	public Object [][]getData()
	{
		Object [][] data=new Object[3][2];
		//for first set
		data[0][0]="firstuser";
		data[0][1]="firstpass";
		//for 2nd set
		data[1][0]="seconduser";
		data[1][1]="secondpass";
		//for 3rd set
		data[2][0]="thirduser";
		data[2][1]="thirdpass";
		
		return data;
		
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}

}
