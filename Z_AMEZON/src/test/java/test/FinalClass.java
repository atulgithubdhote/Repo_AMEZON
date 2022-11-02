package test;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseee.BaseA;
import pages.Loginpage;

import utils.utilityamezon;

	public class FinalClass  extends BaseA{
		WebDriver driver;
		Loginpage loginpage;
		int testID ;
		utilityamezon u;
		SoftAssert s;
@BeforeTest
	 public void lounchbrowser() {
driver=	BaseA.openchromdriver();
} 
 @BeforeClass
  public void POMobj() {
	 loginpage=new Loginpage(driver);
	s =new SoftAssert();
 }
 @BeforeMethod
  public void gotoameson() {
	 driver.get("https://www.amazon.in/");
 }
 @Test
 public void login() {
	 testID=1111;
	 loginpage.clickoncreatnewaccount();
	 loginpage.sendusername();
	 loginpage.clickcontinueusename();
	 loginpage.sendpassworrd();
	 loginpage.clicksignin();
	String urll= driver.getCurrentUrl();
	System.out.println(urll);
	 s.assertEquals(urll,"https://www.amazon.in/ap/sign" );
	 s.assertAll();
 }
 @AfterMethod
  public void screenshot(ITestResult result) throws Exception {
	 if(ITestResult.FAILURE==result.getStatus()) {
		 utilityamezon.screenshots(driver, testID);
		}
	 }
 @AfterClass
  public void closeobject() {
	 loginpage=null; 
 }
 @AfterTest
 public void closedriver() {
	driver.close();;
	driver=null;
	System.gc();//garabage
 }
}
