package pages;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	static Properties config = new Properties();
	static FileInputStream in;
	static WebDriver driver;
	
	public static void properties() {
		try {
			in = new FileInputStream("/websiteAutomation/config/config.properties");
			config.load(in);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void initialize() {
		properties();
		try {
			driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", config.getProperty("path"));
			driver.get(config.getProperty("home"));
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
		String child;
		
		for(String w : windows) {
			child = w;
			driver.close();
			if (child != parent) {
				driver.switchTo().window(child);
			}
		}
		
	}

}
