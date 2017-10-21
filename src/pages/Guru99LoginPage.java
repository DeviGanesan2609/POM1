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

public class Guru99LoginPage
{

	public WebDriver driver;
	
	@FindBy(name="uid")
	public WebElement guru99UserName;
	
	@FindBy(name="password")
	public WebElement guru99Pwd;
	
	@FindBy(name="btnLogin")
	public WebElement guru99LoginBtn;
	
	@FindBy(className="barone")
	public WebElement guru99LoginTitle;
	
	public Guru99LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setUN(String strUN)
	{
		guru99UserName.sendKeys(strUN);
	}
	
	public void setPWD(String strPWD)
	{
		guru99Pwd.sendKeys(strPWD);
	}
	
	public void clickLogin()
	{
		guru99LoginBtn.click();
	}
	
	public String getLoginTitle()
	{
		return guru99LoginTitle.getText();
		 
	}
	
	public void loginGuru99(String strUN,String strPWD)
	{
		this.setUN(strUN);
		this.setPWD(strPWD);
		this.clickLogin();	
	}
	

}
