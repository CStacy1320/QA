package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResults extends Base {
	
	By results = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div[2]/ul//li");
	
	
	public List<WebElement> searchResults() {
		return driver.findElements(results);
	}

}
