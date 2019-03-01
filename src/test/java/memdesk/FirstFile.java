package memdesk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstFile {

@Test
	
	public void test_123() {
		
System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
            driver.get("https://google.com/");
            driver.findElement(By.name("q")).sendKeys("maven tutorial");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
              
	}

}
