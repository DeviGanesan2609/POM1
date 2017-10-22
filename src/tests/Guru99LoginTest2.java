package tests;

import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99LoginPage;
import pages.Guru99LoginPage2;
import pages.TestBase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginTest2 extends Guru99LoginPage2
{


	
  @Test
  public void verify_HomePage_Appears_Correct() 
  {	  
	  Guru99LoginPage2.loginGuru99("mngr100556", "epUvEny");
	  System.out.println("Verification Of Login and Launching Home Page is Success");
  }
}
