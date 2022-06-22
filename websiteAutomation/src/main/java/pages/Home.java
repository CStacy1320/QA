package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Home extends Base {

	By careerLink = By.xpath("/html/body/div[1]/div/header/div[1]/div/div[2]/div[3]/ul/li[2]/a");
	
	
	public WebElement careers() {
		return driver.findElement(careerLink);
	}
}
