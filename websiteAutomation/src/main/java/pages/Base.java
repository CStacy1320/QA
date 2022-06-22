package pages;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void initialize() {
		try {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\catni\\OneDrive\\Desktop\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://www.labcorp.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public WebDriverWait driverWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		return wait;
	}
	
	public void switchWindow() {
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		for(String w : windows) {
			if (parent != w) {
				driver.switchTo().window(w);
			}
		}
		
	
		
	}

}
