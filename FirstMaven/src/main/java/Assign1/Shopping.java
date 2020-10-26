package Assign1;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Shopping {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();// Object is created- Chrome browser is opened
		driver.manage().window().maximize();
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		 
		 driver.get("http://Automationpractice.com");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[1]/input")).sendKeys("jetblue@grr.la");
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/div[2]/span/input")).sendKeys("jetblue");
		 driver.findElement(By.name("Sign in")).click();
		 Thread.sleep(3000);
		 //After user login
		 driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		 
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a")).click();
		 driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div[1]/p/button/span")).click();
		 driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span/text()")).click();
		 
		 //verifying the message displayed 
			WebElement msg =	 driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/h2/text()"));
			String ActualTitle =msg.getText();
			String ExpectedTitle = "Product successfully added to your shopping cart";
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println("Assert Passed");
			
			//verifying the details after checkout
			WebElement msg2 =	 driver.findElement(By.xpath("//*[@id=\"layer_cart_product_title\"]"));
			String actualtitle2 = msg2.getText();
					String ExpectedTitle2 = "Faded Short Sleeve T-shirts";
					Assert.assertEquals(actualtitle2, ExpectedTitle2);		
			WebElement msg3 =	 driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/div[2]/span[2]"));
			String actualtitle3 = msg3.getText();
					String ExpectedTitle3 = "Orange";
					Assert.assertEquals(actualtitle3, ExpectedTitle3);
			WebElement msg4 =	 driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/div[2]/div[1]/strong"));
			String actualtitle4 = msg4.getText();
					String ExpectedTitle4 = "Quantity";
					Assert.assertEquals(actualtitle4, ExpectedTitle4);
			WebElement msg5 =	 driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/div[2]/div[2]/strong"));
			String actualtitle5 = msg5.getText();
					String ExpectedTitle5 = "Total";
					Assert.assertEquals(actualtitle5, ExpectedTitle5);
		 driver.quit();
		 System.out.println("Execution complete");
	}

}
