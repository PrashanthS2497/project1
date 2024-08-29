package Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utils.Utility;

public class ProjectSpecification extends Utility {
	
	//Launch the browser
		@Parameters({"browser", "url"})
		@BeforeMethod
		public void LaunchBrowser(String browser, String url) throws Exception
		{
			browserLaunch(browser, url);
		}
		
		//Reading data and storing in an 2D array
		@DataProvider(name = "DataSpiceJet")
		public String[][] getData() throws Exception
		{
			String [] [] data = ReadExcel(sheetnum);
			return data;
		}

		//Close the browser instance
		@AfterMethod
		public void closeBrowser() throws InterruptedException
		{
			Thread.sleep(3000);		
			driver.quit();
		}
	}
