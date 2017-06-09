package src.test.java;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class TestNG {
	
	public WebDriver driver;
	public String baseURL;
	ExtentReports report; 
	ExtentTest test; 
	
  @BeforeMethod
  public void beforeMethod() {
	  report = new ExtentReports("C:\\Users\\chetan.patel\\Desktop\\UVA_Voices\\LoginTest.html");
	  test = report.startTest("Login test");
  }
  
  @Test
  public void Testing() {
  }
  
  @AfterMethod
  public void afterMethod() {
  }

}
