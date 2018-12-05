package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.MainPage;

public class TestEbay
{
	private String webDir = "http://www.ebay.com/";
	private WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to(webDir);
	}
	
	@Test
	public void findACheapCellpone()
	{
		MainPage mainPage = new MainPage(driver, webDir);
		mainPage.selectCategory();
	}

}
