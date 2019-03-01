package memdesk12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailScreenshot {
	
	@Test
	public void gmail(){
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://gmail.com");
	    
	    driver.findElement(By.id("identifierId")).sendKeys("learn automation");
	    
	    try{
	    	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(scrFile,new File("./screen/gmail.png"));
	    	System.out.println("screen shot taken");
	    	}
	    	 catch (IOException e) {
	    			// TODO Auto-generated catch block
	    			e.printStackTrace();
	    		
	    	 }
		
	    driver.quit();
	}

}
