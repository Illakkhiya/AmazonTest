package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonSignInPage {
	private WebDriver driver;
	private By hover_signIn = By.xpath("//span[text() = 'Hello. Sign in']");
	private By signIn_button = By.xpath("(//span[text() = 'Sign in'])[1]");
	
	public AmazonSignInPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void hoverActionOnSignIn()
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(hover_signIn)).perform();
		
	}
	
	public void clickSignIn()
	{
		driver.findElement(signIn_button).click();
	}
}
