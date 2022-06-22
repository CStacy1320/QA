package test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

		// search from home page
		home.careers().click();
		home.switchWindow();
		career.search1().sendKeys("Software Engineer");
		career.submit1().click();

		// search results for listing
		for (WebElement w : search.searchResults()) {
			if (w.getText().contains("Software Engineer")) {
				w.click();
				break;
			}
		}

		// verify info on job listing page
		Assert.assertEquals(listing.jobTitle().getText(), "Software Engineer");
		Assert.assertEquals(listing.jobId().getText(), "Job Id : 2229774");

		Assert.assertEquals(listing.joblocations().size(), 3);
		Assert.assertEquals(listing.joblocations().get(0).getAttribute("aria-label"),
				"Columbia, Maryland, United States of America");
		Assert.assertEquals(listing.joblocations().get(1).getAttribute("aria-label"),
				"Durham, North Carolina, United States of America");
		Assert.assertEquals(listing.joblocations().get(2).getAttribute("aria-label"),
				"Burlington, North Carolina, United States of America");

		// confirm presence of sentence first paragraph
		Assert.assertTrue(listing.getParagraph().contains(listing.comparisonSentence()));

		// confirm second bullet
		Assert.assertEquals(listing.compareBulletTwo(),
				"Work closely with the Product Management team members to solution and implement new features and functionality as well as refactor and refine existing applications and platforms to ensure scalability and business agility");

		//confirm first bullet under strong preferences contains sql
		Assert.assertTrue(listing.pref().contains("SQL"));
		
		listing.driver.quit();
		
		
		

		
	}

}
