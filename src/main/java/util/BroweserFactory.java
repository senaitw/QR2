package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroweserFactory {
	
	static WebDriver driver;
	
	public static WebDriver startBroweser() {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	driver = new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	return driver;
		
	}
	
}
