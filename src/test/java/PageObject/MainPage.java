package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MainPage 
{
	
	private WebDriver driver;
	private String webUrl;
	private By buttonCategory;
	private By buttonSearch;
	private String cellphoneValue = "15032";
	
	public MainPage (WebDriver driver, String url)
	{
		this.driver = driver;
		webUrl = url;
		buttonCategory = By.name("_sacat");
		buttonSearch = By.id("gh-btn");
	}
	
	public void selectCategory()
	{
		Select dropdownCategory =  new Select(driver.findElement(buttonCategory));
		dropdownCategory.selectByValue(cellphoneValue);
		WebElement search = driver.findElement(buttonSearch);
		search.click();
	}

	
}
