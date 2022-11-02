package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utilityamezon {
	public static String value;
	public static String getexeldata() throws Exception {
	String path="C:\\Users\\M8IN\\OneDrive\\Desktop\\QUESIONS.xlsx";
	FileInputStream fis=new FileInputStream(path);
	Workbook w=WorkbookFactory.create(fis);
	try {
	String value=	w.getSheet("B").getRow(0).getCell(0).getStringCellValue();
	}
	catch(Exception  e) {
		double d=w.getSheet("B").getRow(0).getCell(0).getNumericCellValue();
	Long l=	(long)d;
	 value=Long.toString(l);
	//String value=	Double.toString(d); ANS IN DECIMAL
	return value;
	}
	return value;
	
}
  public static void screenshots(WebDriver driver ,double testID) throws Exception {
	  SimpleDateFormat dateformat= new  SimpleDateFormat ("YYYY-MM-dd HH-mm-ss");
	  Date d=new Date();
String newdate=	  dateformat.format(d);
	   TakesScreenshot t=  ( TakesScreenshot)driver;
	File src=   t.getScreenshotAs(OutputType.FILE);
	File dst=new File ("C:\\velocity\\testscreenshot\\"+testID+" "+newdate+".jpg");
	FileHandler.copy(src,dst); 
   }
}
