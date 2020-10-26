package Assign1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Travel {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir");
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver",path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();// Object is created- Chrome browser is opened
		driver.manage().window().maximize();
		System.out.println("Execution after setting ChromeDriver path in System Variables");
		 
		 driver.get("http://jetblue.com");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/jb-app/jb-header/jb-header-desktop/div[2]/div/div/jb-subnav-desktop/div/div/span[1]/a")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"login-email_xm392z5jo\"]")).sendKeys("jetblue@grr.la");
		 driver.findElement(By.xpath("//*[@id=\"password-email_l6tumttoq\"]")).sendKeys("Jetblue1234");;
		 driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-sign-in-page/div/div[2]/div/jb-trueblue/div/jb-tb-login/form/div[3]/button/span")).click();
		 Thread.sleep(3000);
		 
		 //After loggin in
		 
		 WebElement msg1 =	 driver.findElement(By.xpath("//*[@id=\"jb-tab-id-4\"]/span/span"));
			String actualtitle1 = msg1.getText();
					String ExpectedTitle1 = "Flights";
					Assert.assertEquals(actualtitle1, ExpectedTitle1);
					
					WebElement msg2 =	 driver.findElement(By.xpath("//*[@id=\"jb-tab-id-5\"]/span/span"));
					String actualtitle2 = msg2.getText();
							String ExpectedTitle2 = "Flights + Hotel";
							Assert.assertEquals(actualtitle2, ExpectedTitle2);
							
							WebElement msg3 =	 driver.findElement(By.xpath("//*[@id=\"jb-tab-id-6\"]/span/span"));
							String actualtitle3 = msg3.getText();
									String ExpectedTitle3 = "Flights + Hotel";
									Assert.assertEquals(actualtitle3, ExpectedTitle3);
					
									WebElement msg4 =	 driver.findElement(By.xpath("//*[@id=\"jb-tab-id-7\"]/span/span"));
									String actualtitle4 = msg4.getText();
											String ExpectedTitle4 = "Flights + Hotel";
											Assert.assertEquals(actualtitle4, ExpectedTitle4);
									
											
		//Booking a FLight
		driver.findElement(By.xpath("//*[@id=\"jb-tab-id-4\"]/span/span")).click();
		driver.findElement(By.xpath("//*[@id=\"city-selector_ku1yje3t4\"]")).click();
		Select frmCity = new Select(driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div[1]/div/jb-section-container/div/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/jb-city-pair-selector/div/jb-city-selector[1]/div/div[2]/ul/li[1]/span[2]/span/span[2]")));
		frmCity.selectByVisibleText("AUS");		
		
		driver.findElement(By.xpath("//*[@id=\"city-selector_ln8iwv6o5\"]")).click();
		Select toCity = new Select(driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div[1]/div/jb-section-container/div/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/jb-city-pair-selector/div/jb-city-selector[2]/div/div[2]/ul/li[1]/span[2]/span/span")));
		toCity.selectByVisibleText("TLH");		
		 
		//selecting date

		driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div[1]/div/jb-section-container/div/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/div[3]/jb-date-aggregator/div/div[1]/div[1]/div/input")).click();
		WebElement dateBoxfrom = driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div[1]/div/jb-section-container/div/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/div[3]/jb-date-aggregator/div/div[2]/div/jb-date-picker/div/div[1]/jb-month-viewer[1]/div/div"));
		dateBoxfrom.sendKeys("10162020");
		
		driver.findElement(By.xpath("//*[@id=\"return-date_2ynnarq0j\"]")).click();
		WebElement dateBoxto = driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div[1]/div/jb-section-container/div/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/div[3]/jb-date-aggregator/div/div[2]/div/jb-date-picker/div/div[1]/jb-month-viewer[1]/div/div"));
		dateBoxto.sendKeys("10202020");
		
		
		
		driver.findElement(By.xpath("/html/body/jb-app/jb-basic-template/div/div/jb-section-header-container/div/div[1]/div/jb-section-container/div/div/div/jb-book-trip-container/jb-pattern-block/div/div[2]/div/jb-booker-tabs-container/div/jb-tabs/section/div[1]/jb-tab-panel/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/div[3]/div/jb-traveler-selector/div/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"jb-tabpanel-id-4\"]/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/div[3]/div/jb-traveler-selector/div/div[2]/div/jb-traveler-selector-options/jb-traveler-selector-flights/ul[1]/li[1]/jb-stepper/div/button[2]/jb-icon/svg/g/path[2]")).click();
		driver.findElement(By.name("Search Flight")).click();
		
		
		//Logout function
		driver.findElement(By.xpath("//*[@id=\"jb-tabpanel-id-4\"]/jb-booker-tabs-wrapper/div/jb-booker-air-wrapper/div/jb-booker-air/form/div/div[3]/div/jb-traveler-selector/div/div[2]/div/jb-traveler-selector-options/jb-traveler-selector-flights/ul[1]/li[1]/jb-stepper/div/button[2]/jb-icon/svg/g/path[2]")).click();
	}

}
