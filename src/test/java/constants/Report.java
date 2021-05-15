package constants;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Report {

	public ExtentReports report=new ExtentReports(".//Report//report.html",false);
	public ExtentTest test;
	
	public ExtentReports report1=new ExtentReports(".//Report//invalidreport.html",false);
	public ExtentTest test1;
	
	public ExtentTest startReport(String testname){
		return report.startTest(testname);
	}
	
	public void endReport(ExtentTest test){
		report.endTest(test);
		report.flush();
	}
	public ExtentTest startReport1(String testname){
		return report1.startTest(testname);
	}
	
	public void endReport1(ExtentTest test1){
		report1.endTest(test1);
		report1.flush();
	}
}
