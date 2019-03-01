package memdesk12;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomLisnter.class)
public class Screenshots extends Base {
	  //public WebDriver driver;
	@BeforeMethod
	public void setUp(){
		initialization();
		
	}
	@AfterMethod
	public void quit(){
		driver.quit();
	}

	@Test
	public void takeScreenshot(){
		 driver.get("https://gmail.com");
	WebElement emailId =	driver.findElement(By.id("identifierId"));
	emailId.sendKeys("learn automation");
		Assert.assertEquals(emailId,"learn","String is not matched");
	}
    @Test
    public void takeScreenshot1(){
    	String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Gogle","String is not matched");
    }
	
	}