package stepdef;

import org.codehaus.plexus.util.cli.Commandline.Argument;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDef {

	WebDriver driver;
	
	@Given("^user is already on the login page$")
	public void user_on_login_page()
	{
		//String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Milan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.navigate().to("https://ui.freecrm.com/");
	}
	
	@When("^title of the login page is$")
	public void title_login()
	
	{
		String title =  driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@And("^user enter username and password$")
	public void user_enter_username_and_password() {
	    // code that turns the phrase above into concrete actions
		driver.findElement(By.name("email")).sendKeys("milan.gautam7991@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Jaipur7991#");
		
		System.out.println("ayaa1");
		
	   	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button()
	{
	    // code that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[1]/div/div/form/div/div[3]")).click();
		//class="ui fluid large blue submit button"
		/*WebElement loginbtn = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",loginbtn);*/
		
	    System.out.println("ayaa1");
	}
	
	
}

