package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (xpath="//a[@id='nav-link-accountList']")
	private WebElement creatnewaccount;
@FindBy (xpath="//input[@id='ap_email']")
private WebElement username;
@FindBy (xpath="//input[@id='continue']")
private WebElement continueusename;
@FindBy (xpath="//input[@id='ap_password']")
private WebElement passworrd;
@FindBy(xpath="//input[@id='signInSubmit']")
private WebElement signin;

public Loginpage(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void clickoncreatnewaccount() {
	creatnewaccount.click();
}
public void sendusername() {
	username.sendKeys("9604184296");
}
public void clickcontinueusename() {
	continueusename.click();
}
public void sendpassworrd() {
	passworrd.sendKeys("9604184296");
}
public void clicksignin() {
	signin.click();	
}





}
