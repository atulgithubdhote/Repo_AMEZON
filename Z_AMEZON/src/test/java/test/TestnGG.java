package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Loginpage;
import pages.MouseActionclassorderlist;

public class TestnGG {
	private WebDriver driver;
	private MouseActionclassorderlist mac;
	private Loginpage loginpage ;
@BeforeClass
public void lounchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
	//configuration webdriver with chrome driver
	driver= new ChromeDriver(); 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwxveXBhDDARIsAI0Q0x0dmfHFSsFrN4cpCUuaZi9V7_dxDrRQY0rAKRamnTpEQRObJAfT4mwaAoTkEALw_wcB%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9299648%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D3205384857241153085%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");	

}
@BeforeMethod
public void gotoactionclasselement () {
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Dlogin%2Bamazon%2Baccount%26adgrpid%3D59671903835%26ext_vrnc%3Dhi%26gclid%3DCj0KCQjwxveXBhDDARIsAI0Q0x0dmfHFSsFrN4cpCUuaZi9V7_dxDrRQY0rAKRamnTpEQRObJAfT4mwaAoTkEALw_wcB%26hvadid%3D590652406969%26hvdev%3Dc%26hvlocphy%3D9299648%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D3205384857241153085%26hvtargid%3Dkwd-294882733100%26hydadcr%3D24542_2265395%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");	
	 mac=new MouseActionclassorderlist(driver);
	 loginpage =new Loginpage(driver);
		
}
@Test
public void test1() {
	 loginpage =new Loginpage(driver);
	
	loginpage.sendusername();
	loginpage.clickcontinueusename();
	loginpage.sendpassworrd();
	loginpage.clicksignin();
	
	}
@Test
public void test2() {
	System.out.println("test 2 ");
	mac.clickonaccountList();
	mac.clickOrderlist();
	//driver.manage().window().maximize();
	//.navigate().back();
}
}
