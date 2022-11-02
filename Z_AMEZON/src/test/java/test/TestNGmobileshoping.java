package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.POMobileshopingP;

	public class TestNGmobileshoping {
		private WebDriver driver;
		//private POMobileshopingP pomobileshopingP;
private		POMobileshopingP		pomobileshopingP=new POMobileshopingP (driver);
	@BeforeClass
		public void lounchbrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\velocity\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver(); 
		}
	@BeforeMethod
	public void gotomobile() {
		driver.get("https://www.amazon.in/");
		pomobileshopingP=new POMobileshopingP (driver);
	}
	@Test (priority=1)
	public void test1mobileclick() {
	//	pomobileshopingP=new POMobileshopingP (driver);
		pomobileshopingP.clickonmobile();
	}
	//( dependsOnMethods={" gotomobile() "})
	@Test(priority=2)
	public void movetoelectronics() {
		pomobileshopingP.clickonmobile();
		pomobileshopingP.mousemoveonelectronic(driver);
	}
	@Test(priority=3)
	public void clicksmartphone() throws InterruptedException {
		pomobileshopingP.clickonmobile();
		pomobileshopingP.mousemoveonelectronic(driver);
		Thread.sleep(2000);
		pomobileshopingP.clickonsmartphone(driver);
	}
	@Test (priority=4)
	public void clicksmphone() throws Exception {
		pomobileshopingP.clickonmobile();
		pomobileshopingP.mousemoveonelectronic(driver);
		Thread.sleep(2000);
		pomobileshopingP.clickonsmartphone(driver);
		Thread.sleep(2000);
		pomobileshopingP.clickonphon();
		
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
	
	
	
	}
	
	
	
	
