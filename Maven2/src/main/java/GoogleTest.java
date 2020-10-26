import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	String path = System.getProperty("user.dir");
	driver =  new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	 
	/*
	 * @Test (priority=2, groups="titleverify") public void googleTitleTest() {
	 * String title= driver.getTitle(); System.out.println(title);
	 * 
	 * }
	 */
	@Test
	public void verifyTitleTest()
	{
		String title= driver.getTitle();
		//System.out.println(title);
		Assert.assertEquals(title, "Google", "Title present");
		
	}
	
	
	/*
	 * @Test (priority=1,groups="logo") public void googlelogoTest() { Boolean
	 * logo=driver.findElement(By.id("hplogo")).isDisplayed();
	 * System.out.println("after logo check" +logo);
	 * 
	 * }
	 */
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();	
		
	}
	
	
	
}
