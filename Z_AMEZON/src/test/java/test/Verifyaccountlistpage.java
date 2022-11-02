package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.MouseActionclassorderlist;

public class Verifyaccountlistpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		//configuration webdriver with chrome driver
		WebDriver driver= new ChromeDriver(); //up casting
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");

MouseActionclassorderlist mac=new MouseActionclassorderlist(driver);
	mac.clickonaccountList();
	mac.clickOrderlist();
	driver.manage().window().maximize();
	driver.navigate().back();
}

	}


