package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import page.PostsPage;
import page.QuickDraftPage;
import util.BroweserFactory;

public class LoginTest {
	
	WebDriver driver;
@Test
	public void validuserShoulabletologin() throws InterruptedException {
		driver = BroweserFactory.startBroweser();
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.enterUserName("opensourcecms");
		loginpage.enterPassword("opensourcecms");
		loginpage.clickonloginButton();
		Thread.sleep(3000);

	QuickDraftPage quickdraftpage = PageFactory.initElements(driver, QuickDraftPage.class);	
	quickdraftpage.writetitle("practice again and again");	
	quickdraftpage.writecontent("what do you want learn");
	quickdraftpage.saveDraftButton();
	quickdraftpage.yourRecentDraft();
	Thread.sleep(5000);

	PostsPage postpage = PageFactory.initElements(driver, PostsPage.class);
	postpage.clickonposts();
	postpage.clickonallposts();
	postpage.validateinput();
	}
}
