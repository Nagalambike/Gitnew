package Demo;

import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Test1 {

	
		@BeforeSuite
		public void setup()
		{
			System.out.println("Iam in before suite");
		}
		@BeforeTest
			public void launchbrowser()
			{
				System.out.println("iam in before test");
			}
		@BeforeClass
		public void login()
		{
			System.out.println("iam in before class");
		

	}
		@BeforeMethod
		public void enerUrl()
		{
			System.out.println("iam in before method");
		}
		@Test
		public void validatelogin()
		{
			System.out.println("iam in test");

		}
		
	@AfterMethod
	public void signout()
	{
		System.out.println("iam in after method");
	}
	
	@AfterClass
	public void closebrowser()
	{
		System.out.println("iam in after class");
	}
	@AfterTest
	public void deletecookies()
	{
		System.out.println("iam in after test");
	}
	
	@AfterSuite
	public void generatereport()
	{
		System.out.println("iam in after suite");
	}
@Test
public void validatehomepage()
{
	System.out.println("iam in test2");
}
	
	
	

}
