package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
 
	WebDriver driver;
 public LoginPage(WebDriver driver) {
	 this.driver = driver;
 }
//Element library 1
   @FindBy(how=How.ID, using ="user_login")
	WebElement userName_Field;
   @FindBy(how=How.ID, using ="user_pass")
   WebElement userPass_Field;
   @FindBy(how=How.ID, using = "wp-submit")
   WebElement login_Button;
   
   public void enterUserName(String username1) {
	   userName_Field.sendKeys(username1);
   }
   public void enterPassword(String password1) {
	   userPass_Field.sendKeys(password1);
   }
  public void clickonloginButton() {
	  login_Button.click();
  }
}

