import org.testng.annotations.Test;

public class TestNGFeat {

	@Test
	public void logintest()
	{
				System.out.println("login test");
	}
	
	@Test (dependsOnMethods = "logintest")
	public void HomePage()
	{
		System.out.println("Home test");
	}
	
	@Test (dependsOnMethods = "logintest")
	public void AboutUs()
	{
		System.out.println("About Us test");
	}
	
	@Test (dependsOnMethods = "logintest")
	public void ContactUs()
	{
		System.out.println("Contact test");
	}
}
