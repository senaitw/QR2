package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class QuickDraftPage {

	WebDriver driver;
	
	public QuickDraftPage(WebDriver driver) {
	this.driver = driver;
	}
	@FindBy(how =How.XPATH, using="//input[@name='post_title']")
	WebElement Title_input;
	
	@FindBy(how =How.XPATH, using= "//textarea[@id='content']")
	WebElement Content_input;
	
	@FindBy(how =How.XPATH, using="//input[@id='save-post']")
	WebElement Save_DraftButton;
	
	@FindBy(how =How.XPATH, using ="//a[text()='practice again and again']")
	WebElement YourrecentDraft;
	
	public void writetitle(String title) {
		Title_input.sendKeys(title);
	}
	public void writecontent(String content) {
      Content_input.sendKeys(content);
	}
	public void saveDraftButton() {
		Save_DraftButton.click();
	}
	public void yourRecentDraft() {
		Assert.assertTrue(YourrecentDraft.isDisplayed());
	}

}
