package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Careers extends Base {
	
	By searchBox1 = By.xpath("//*[@id=\"typehead\"]");
	By submitBtn1 = By.xpath("/html/body/div[1]/section[2]/div/div/header/div[1]/div/div[4]/section/div/form/div[2]/div/span/button");
	
	public WebElement search1() {
		return driver.findElement(searchBox1);
	}
	
	public WebElement submit1() {
		return driver.findElement(submitBtn1);
	}

}
