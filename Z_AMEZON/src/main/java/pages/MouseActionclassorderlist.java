package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionclassorderlist {
	
	
private	WebDriver driver;
	private Actions act    ;
	private WebDriverWait wait;//explicit wait
	
@FindBy (xpath="//a[@id='nav-link-accountList']")	
private WebElement accountList;

@FindBy (xpath="//span[text()='Your Orders']")//span[text()='Your Orders']
private WebElement orderr;
 public MouseActionclassorderlist(WebDriver driver) {
	 	PageFactory.initElements(driver, this);
	 	this.driver=driver ;///lihile  nahi tr nullpoint eception dakhavnar
	 	act =new Actions(driver) ;// every time method madhe object creat kra lagnar nahi Actions act=new Actions (driver)
	 	wait=new WebDriverWait (driver,20);
 }
public void clickonaccountList() {
	
		//Actions act=new Actions (driver);//driver global declare kela aahe webdriver driver
//	act.moveToElement(accountList).click().perform();	ha click karnar
		act.moveToElement(accountList).perform();//ha mouse gheunjanar 
	
}
public void clickOrderlist() {
	//Actions act=new Actions (driver);//driver global declare kela aahe webdriver driver
	wait.until(ExpectedConditions.visibilityOf(orderr));
	act.moveToElement(orderr).click().perform();
	
	
}


}
