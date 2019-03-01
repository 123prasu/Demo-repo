package memdesk;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdFile {

	public static WebDriver driver;
	public static void initialization(){

		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
		new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
             
	    driver.navigate().to("https://webmail.netzero.net/?cf=sp");
	    
	
	
	
	}


	/*public void failed(){

		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\pdesire\\workspace\\testing123\\screenshots\\mytest.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}
	}*/

}
