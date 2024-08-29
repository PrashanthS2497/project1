package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecification;
import pages.HomePage;

public class TC007_ManageBookings extends ProjectSpecification{
	
	@BeforeTest
	public void setUp()
	{
		sheetnum = 4;
	}
	
	@Test(dataProvider ="DataSpiceJet")
	public void ManageBookingsTest(String mobileNum, String password, String type)
	{
		HomePage obj = new HomePage(driver);
		
		obj.clickLogin();
		obj.enterMobileNumber(mobileNum);
		obj.enterPassword(password);
		obj.LoginValidation(type);
		obj.clickManageBookings();
	}
	
	@Test(dataProvider ="DataSpiceJet")
	public void AddToItenaryTest(String mobileNum, String password, String type) throws InterruptedException
	{
		HomePage obj = new HomePage(driver);
		
		obj.clickLogin();
		obj.enterMobileNumber(mobileNum);
		obj.enterPassword(password);
		obj.LoginValidation(type);
		obj.clickManageBookings();
		Thread.sleep(3000);
		obj.clickAddYourItenary();
		Thread.sleep(3000);
		obj.clickViewUpcomingTrips();
	}

	@Test(dataProvider ="DataSpiceJet")
	public void ViewChangeAssistTest(String mobileNum, String password, String type) throws InterruptedException
	{
		HomePage obj = new HomePage(driver);
		
		obj.clickLogin();
		obj.enterMobileNumber(mobileNum);
		obj.enterPassword(password);
		obj.LoginValidation(type);
		obj.clickManageBookings();
		Thread.sleep(3000);
		obj.clickAddYourItenary();
		Thread.sleep(3000);
		obj.clickViewChangeAssist();
	}
	
}
