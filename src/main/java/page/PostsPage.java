package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PostsPage {

	WebDriver driver;
	public void Posts(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.XPATH, using = "//div[text()='Posts']")
	WebElement ClickonPosts;

	@FindBy(how =How.XPATH, using = "//a[text()='All Posts']")
	WebElement ClickonAllPosts;
	
	@FindBy(how =How.XPATH,using = "//a[text()='practice again and again']")
	WebElement validateInput;
	
	public void clickonposts() {
		ClickonPosts.click();
	}
	public void clickonallposts() {
		ClickonAllPosts.click();
	}
   
   public void validateinput() {
	   Assert.assertTrue(validateInput.isDisplayed());
   }
}
