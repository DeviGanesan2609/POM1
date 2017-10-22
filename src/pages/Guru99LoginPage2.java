package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99LoginPage2 extends TestBase
{

	public Guru99LoginPage2()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public static WebDriver driver ;
	
	@FindBy(name="uid")
	public static WebElement guru99UserName2;
	
	@FindBy(name="password")
	public static WebElement guru99Pwd2;
	
	@FindBy(name="btnLogin")
	public static WebElement guru99LoginBtn2;
	
	@FindBy(className="barone")
	public static WebElement guru99LoginTitle2;
	
/*	public Guru99LoginPage2(WebDriver driver)
	{
		Guru99LoginPage2.driver = driver;
		PageFactory.initElements(driver, this);
	}*/
	
	public static void setUN(String strUN)
	{
		guru99UserName2.sendKeys(strUN);
	}
	
	public  static void setPWD(String strPWD)
	{
		guru99Pwd2.sendKeys(strPWD);
	}
	
	public static void clickLogin()
	{
		guru99LoginBtn2.click();
	}
	
	public static String getLoginTitle2()
	{
		return guru99LoginTitle2.getText();
		 
	}
	
	public static void loginGuru99(String strUN,String strPWD)
	{
		PageFactory.initElements(driver, Guru99LoginPage2.class);
		guru99UserName2.sendKeys(strUN);	
		guru99Pwd2.sendKeys(strPWD);
		guru99LoginBtn2.click();
	}
	

}
