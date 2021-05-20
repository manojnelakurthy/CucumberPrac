package constants;

import java.io.File;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Screenshot{
	driverfactory factory=new driverfactory();
	public void screenShot(ExtentTest test) throws Exception{
		Random rand=new Random();
		int random=rand.nextInt(100);
		TakesScreenshot ss= (TakesScreenshot)	factory.driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\WorkSpace\\Cucumber\\image\\screenshot"+random+".png");
		FileUtils.copyFile(src, dest);
	
		String file =test.addScreenCapture("E:\\WorkSpace\\Cucumber\\image\\screenshot"+random+".png");
		test.log(LogStatus.INFO, file);
		
	}
}