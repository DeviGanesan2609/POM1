package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase 
{
	 public static WebDriver driver;
	 public static String methodname;	
	 
	public TestBase(WebDriver driver)
	{
		this.driver=driver;
	}

	public  void getScreenShots(String methodname)
	{
		
		TakesScreenshot scrShotObj = ((TakesScreenshot)driver);
		 try
			{
			// System.out.println(i.getMethod().getMethodName());
			File srcFile = scrShotObj.getScreenshotAs(OutputType.FILE);
			 File destFile = new File("./ScreenShots/"+methodname+"_"+System.currentTimeMillis()+".png");
			 FileUtils.copyFile(srcFile, destFile);
			} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
	}
/*	  @BeforeTest
	  public static void setupBrowser() 
	  {
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("http://demo.guru99.com/V4/");
	  }
	  @AfterTest
	  public static void endBrowserSession()
	  {
		  driver.quit();
	  }*/
		 
}
