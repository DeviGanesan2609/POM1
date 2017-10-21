package tests;

import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99LoginPage;
import pages.TestBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99LoginTest 
{
	 WebDriver driver;
	 Guru99LoginPage loginPageObj;
	 Guru99HomePage homePageObj;
	 TestBase testBaseObj ;
	String methodname;
	
  @Test
  public void verify_HomePage_Appears_Correct() 
  {
	  loginPageObj = new Guru99LoginPage(driver);
	  Assert.assertTrue(loginPageObj.getLoginTitle().toLowerCase().contains("guru99 bank"));
	  loginPageObj.loginGuru99("mngr100556", "epUvEny");
	  homePageObj = new Guru99HomePage(driver);
	  Assert.assertTrue(homePageObj.guruHmePageTitle().toLowerCase().contains("mngr100556"));
	  System.out.println("Verification Of Login and Launching Home Page is Success");
	
	 // System.out.println(result.getName().toString().trim());
  }
  
  @AfterMethod
  public void scrShot(ITestResult result)
  {		methodname = result.getMethod().getMethodName();
  
	  testBaseObj = new TestBase(driver);
	  testBaseObj.getScreenShots(methodname);
  }
  
  @BeforeTest
  public void setupBrowser() 
  {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("http://demo.guru99.com/V4/");
  }

  @AfterTest
  public void endBrowserSession()
  {
	  driver.quit();
  }
 
  

}
