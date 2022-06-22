package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResults extends Base {
	
	By results = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div[2]/ul//li/div[1]/span/a/div");
	By seTitle = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div[2]/ul/li[1]/div[1]/span/a/div/span");
	By seID = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div[2]/ul/li[1]/div[1]/p/span[5]/span");
	By seHours = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div[2]/ul/li[1]/div[1]/p/span[6]/span/span[2]");
	By seLocs = By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/section[3]/div/div/div/div[2]/div[2]/ul/li[1]/div[1]/div[4]/div/ul//li");
	
	
	public List<WebElement> searchResults() {
		return driver.findElements(results);
	}
	
	public WebElement getSeTitle() {
		return driver.findElement(seTitle);
	}
	
	public WebElement getSeID() {
		return driver.findElement(seID);
	}
	
	public WebElement getSeHours() {
		return driver.findElement(seHours);
	}
	
	public WebElement getSeLocs() {
		return driver.findElement(seLocs);
	}

}
