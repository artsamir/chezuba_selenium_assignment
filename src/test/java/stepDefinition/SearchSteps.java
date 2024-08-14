package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SearchPage;

public class SearchSteps {
	
	WebDriver driver;
	SearchPage searchpage;
	
	@Given("User is on the home page by entering the url")
	public void user_is_on_the_home_page_by_entering_the_url() {
	    
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		searchpage = new SearchPage(driver);
	}

	@When("User enter {string}")
	public void user_enter(String string) {
	    
		searchpage.enterSearchTerm(string);
		
	}

	@When("User click the search button")
	public void user_click_the_search_button() {
	    
		searchpage.clickSearchBtn();
	}

	@Then("The result area should display results for {string}")
	public void the_result_area_should_display_results_for(String expectedResult) {
	    
		String actualResult = searchpage.getSearchResult();
		
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
	}

	

}
