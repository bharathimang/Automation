package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Report {

	public static void main(String[] args) {
		
		ExtentHtmlReporter report=new ExtentHtmlReporter("report.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		ExtentTest test= extent.createTest("Demo", "SignUp");
		
		String s="Arun";
		
		if(s.equalsIgnoreCase("arun"))
		{
			System.out.println("Test is passed");
			test.log(Status.PASS, "Expected Result");
		}
		else
		{
			test.log(Status.FAIL, "Not expected String");
		}
		
		
		
		extent.flush();

	}

}
