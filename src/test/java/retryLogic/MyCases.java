package retryLogic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class MyCases {
	
public WebDriver driver;
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

	}
	
@Test
public void test_1(){
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google");
}

@Test
public void test_2(){
	boolean k = driver.findElement(By.linkText("Gmail")).isDisplayed();
	System.out.println(k);
	Assert.assertEquals(true,false);
}
@AfterMethod
public void quit(){
	driver.quit();
}


}
 