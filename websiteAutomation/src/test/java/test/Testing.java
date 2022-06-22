package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Base;
import pages.Careers;
import pages.Home;
import pages.Listing;
import pages.SearchResults;

public class Testing {
	
	@BeforeTest
	public void setUp() {
		Base.initialize();
	}
	
	@Test(priority = 1)
	public void searchJob() {
		Home home = new Home();
		Careers career = new Careers();
		SearchResults search = new SearchResults();
		Listing listing = new Listing();
		
		//search from home page
		home.careers().click();
		career.search1().sendKeys("Software Engineer");
		career.submit1().click();
		
		//search results for listing
		for (WebElement w : search.searchResults()) {
			if(w.getText().contains("Software Engineer")) {
				w.click();
				break;
			}
		}
	}

}
