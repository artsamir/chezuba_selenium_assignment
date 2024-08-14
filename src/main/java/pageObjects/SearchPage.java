package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	WebDriver driver;
	
	// Constructor to initialise element with PageFactory
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// locate element of search text field
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchtxtbox;
	
	// locate search button
	@FindBy(id = "nav-search-submit-button")
	private WebElement searchButton;
	
	
	// locate element of search result text
	@FindBy(xpath = "//div[@class=\"sg-col-inner\"]/div/span[3]")
	private WebElement searchResult;

	
	// method to enter search term
	public void enterSearchTerm(String searchTerm) {
		searchtxtbox.sendKeys(searchTerm);
	}
	
	// Method to click search button
	public void clickSearchBtn() {
		searchButton.click();
	}
 
	// Method for getTest from result Area
	public String getSearchResult() {
		return searchResult.getText();
	}
	
	
	

}
