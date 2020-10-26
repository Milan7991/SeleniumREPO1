import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeSuite
	public void setup()
	{
		System.out.println("Setup");
		
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch chrome");
	}
	
	@BeforeMethod
	public void enterurl()
	{
		System.out.println("enter url");
		
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("login");
		
	}
	
	@Test
	public void googletitletest()
	{
		System.out.println("ok title test");
		
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logged out  ");
		
	}
	
	@AfterTest
	public void deleteallcookies()
	{
		System.out.println("cokkies deleted");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("CLosed chorme");
		
	}
	
	@AfterSuite
	public void generateTestReport()
	{
		System.out.println("Report genereated");
		
	}
	
}
