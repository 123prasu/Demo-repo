package memdesk;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondFile extends Exception {
	public static WebDriver driver = null;
	//public String baseURL = "";

	@BeforeTest
	@Parameters("browser")
	public void setBaseURL(String browser) throws InterruptedException, IOException {
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("your test cases are running in chrome browser");
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/webdriverchrome/chromedriver.exe");
			/*---opening the chrome browser----*/
			driver =  new ChromeDriver();
			/*---maximizing the browser window---*/
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			Thread.sleep(2000);
			/*---Entering the store url in browser window---*/
			System.out.println("navigating to EQA1 store page!!!!");
			String baseURL = "http://store.qa7.netzero.net/?cf=sp";
			driver.navigate().to(baseURL);

		}
	}

	@Test
	public void test2() throws InterruptedException {

		/*----printing the web page name---*/
		System.out.println( driver.getTitle());

		/*---ordering new megamail account ---*/
		System.out.println("purchasing a new meagamail account");

		driver.findElement(By.xpath("//*[@id='serviceList']/a[14]/section/div[3]/button")).click();
		Thread.sleep(2000);

		List<WebElement> radios = driver.findElements(By.xpath("//*[@type='radio'and@name='offerId']"));
		for (int i = 0; i < radios.size(); i++) {

			WebElement radio1 = radios.get(i);

			String check = radio1.getAttribute("value");
			if (check.equalsIgnoreCase("1")) {
				radio1.click();
			}
		}


		driver.findElement(By.id("realButton")).click();

		/*---- Filling the registration details----*/

		System.out.println("****filling the registartion details****");
		Thread.sleep(1500);
		new Select(driver.findElement(By.id("userTitle"))).selectByValue("TITLE_MR");
		Thread.sleep(200);
		driver.findElement(By.id("firstName")).sendKeys("Prasannakumar");
		Thread.sleep(1000);
		driver.findElement(By.id("lastName")).sendKeys("Desireddy");
		Thread.sleep(200);
		driver.findElement(By.id("billingAddress.streetName")).sendKeys("77 9th ave");
		Thread.sleep(1800);
		driver.findElement(By.id("billingAddress.city")).sendKeys("Newyork");
		Thread.sleep(1500);
		new Select(driver.findElement(By.id("billingAddress.state"))).selectByValue("NY");
		driver.findElement(By.id("billingAddress.zip")).sendKeys("10011");
		driver.findElement(By.id("mobileNumberId")).sendKeys("8182873480");
		Thread.sleep(1000);
		driver.findElement(By.id("sendSMSBtn")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='pvcodeId']")).sendKeys(driver.manage().getCookieNamed("otp").getValue());
		Thread.sleep(2000);
		System.out.println("Your mobile otp Number is: "+driver.manage().getCookieNamed("otp").getValue());
		Thread.sleep(1500);
		driver.findElement(By.id("checkCode")).click();
		Thread.sleep(200);
		driver.findElement(By.id("altEmailAddress")).sendKeys("pdesire@corp.untd.com");
		Thread.sleep(1000);
		Date dd = new Date();
		long date = dd.getTime(); 
		WebElement test1 = driver.findElement(By.id("memberId"));
		test1.sendKeys("jfaux-pdesire"+date);
		String tt = "jfaux-pdesire"+date;
		//System.out.println("Your mobile otp Number is: "+tt);
		Thread.sleep(1500);
		WebElement test =driver.findElement(By.xpath("//*[@id='order']/article/section[2]/div[4]/input"));
		test.click();
		Thread.sleep(1500);
		driver.findElement(By.id("password")).sendKeys("netzero");
		String tt1 = "netzero";
		driver.findElement(By.id("formPassword2")).sendKeys("netzero");
		Thread.sleep(1000);
		new Select(driver.findElement(By.id("secretQuestionCode"))).selectByValue("2");
		Thread.sleep(1500);
		driver.findElement(By.id("secretAnswer")).sendKeys("sweety");
		Thread.sleep(1500);
		driver.findElement(By.id("ccNumber")).sendKeys("5412345678901190");
		new Select(driver.findElement(By.id("ccExpMonth"))).selectByValue("01");
		Thread.sleep(100);
		new Select(driver.findElement(By.id("ccExpYear"))).selectByValue("2023");
		Thread.sleep(100);
		driver.findElement(By.id("ccCvm")).sendKeys("785");
		driver.findElement(By.xpath("//*[@id='acceptTermsHTML']/div[2]/div[1]/label/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("purchaseSubmit")).click();
		System.out.println("printing the login UserId and password");
		String  mId = driver.findElement(By.id("memId")).getText();
		System.out.println("your login "+mId);
		String mPasswd = driver.findElement(By.id("memPass")).getText();
		System.out.println("your login "+mPasswd);
		System.out.println("Registration is completed successfully, Closing the browser window");
		/*----closing the chrome browser----*/
		driver.quit();



	}

}
