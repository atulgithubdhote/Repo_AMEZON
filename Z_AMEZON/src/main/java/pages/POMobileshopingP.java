package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMobileshopingP {
	@FindBy (xpath="//a[text()='Mobiles']")
	private WebElement mobile;
	@FindBy (xpath="//img[@alt='Electronics']")
	private WebElement electronics ;
	@FindBy (xpath="//span[text()='Smartphones & Basic Mobiles']")
	private WebElement  smartphone;
	@FindBy (xpath="(//li[@class='octopus-pc-item octopus-pc-item-v3'])[1]")
	private WebElement smsngph;

	@FindBy (xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocart;
	
	public POMobileshopingP (WebDriver driver) {
	PageFactory.initElements(driver, this);
	           }
	public void clickonmobile() {
		mobile.click();
	}
	public void mousemoveonelectronic(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(electronics ).perform();
		act.moveToElement(smartphone).click().build().perform();
	}
	public void  clickonsmartphone(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(electronics ).perform();
		act.moveToElement(smartphone).click().build().perform();

	}
public void clickonphon() {
	smsngph.click();
}

}
