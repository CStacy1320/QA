package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Listing extends Base {

	By title = By.className("job-title");
	By locations = By.xpath(
			"/html/body/div[2]/div[2]/div/div[1]/div[2]/section/div/div/div/div[1]/section/div/div[2]/div/ul//li");
	By id = By.xpath(
			"/html/body/div[2]/div[2]/div/div[1]/div[2]/section/div/div/div/div[1]/section/div/div[1]/span[2]/span");
	By applyBtn = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/section[1]/div/div/div[2]/div[4]/a");
	By firstParagraph = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/section[1]/div/div/div[2]/div[2]/div/p[6]");
	By bullets = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/section[1]/div/div/div[2]/div[2]/div/ul//li");
	By preferred = By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/div/div[1]/section[1]/div/div/div[2]/div[2]/div/ul[3]/li[1]/p");

	String secondSentence = ("You are a full-stack developer but lean more heavily on back-end development of modern web applications (ASP.NET Core, C#, Azure) and have extensive experience creating system integrations and RESTful APIs");

	public WebElement jobTitle() {
		return driver.findElement(title);
	}

	public List<WebElement> joblocations() {
		return driver.findElements(locations);
	}

	public WebElement jobId() {
		return driver.findElement(id);
	}

	public WebElement jobApplyBtn() {
		return driver.findElement(applyBtn);
	}
	
	public String getParagraph() {
		String pg = driver.findElement(firstParagraph).getText();
		return pg;
	}
	
	public String comparisonSentence() {
		return secondSentence;
	}
	
	public String compareBulletTwo() {
		List<WebElement> b =  driver.findElements(bullets);
		return b.get(1).getText();
	}
	
	public String pref() {
		return driver.findElement(preferred).getText();
	}

}
