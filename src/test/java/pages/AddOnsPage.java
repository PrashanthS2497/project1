package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.ProjectSpecification;

public class AddOnsPage extends ProjectSpecification{
	
	//constructor
	public AddOnsPage(WebDriver driver)
	{
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	

	//Element locators
	@FindBy(xpath = "(//div[text()='Continue'])[3]") WebElement continueButton2;
	@FindBy(className = "tt_skip_link") WebElement SkipLink;

	
	//Methods
	public AddOnsPage clickContinueButton2()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",continueButton2 );
		return this;
	}
	
	public PaymentDetailsPage clickAdClose()
	{
		
		SkipLink.click();
		return new PaymentDetailsPage(driver);
	}
	
	
}
