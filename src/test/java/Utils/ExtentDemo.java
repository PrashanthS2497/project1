package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {
	
	public static ExtentReports getReport()
	{
		String path = "C:\\Users\\prash\\eclipse-workspace\\project1\\Report.html";
		ExtentSparkReporter obj = new ExtentSparkReporter(path);
		obj.config().setReportName("DemoReport");
		
		ExtentReports ext = new ExtentReports();
		ext.attachReporter(obj);
		return ext;
		
	}

}

