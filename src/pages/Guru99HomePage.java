package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99HomePage
{
	public WebDriver driver;
    @FindBy(xpath="//tr[@class='heading3']/td")

    public WebElement homePageDashBoardText;
	
	public Guru99HomePage(WebDriver driver)
	{
		this.driver= driver;	
		PageFactory.initElements(driver, this);
	}
	
	public String guruHmePageTitle()
	{
		return homePageDashBoardText.getText();
	}
}
