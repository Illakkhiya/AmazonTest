package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AmazonSignInPage;

public class AmazonSignInTest {
	private WebDriver driver;
	private AmazonSignInPage signInPage;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ILLAKKHIYA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	
	 @Test
	public void test_SignInPage_Appear()
	{
		signInPage = new AmazonSignInPage(driver);
		signInPage.hoverActionOnSignIn();
		signInPage.clickSignIn();
	}
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}

}
