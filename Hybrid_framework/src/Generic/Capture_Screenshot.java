package Generic;

import java.io.File;
import java.util.logging.FileHandler;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class Capture_Screenshot 
{


public static void Screenshot(WebDriver driver)
{
	try
	{
		String path= "./Screenshot/";
		Date d = new Date();
		String d1= d.toString();
		String d2 = d1.replaceAll(":","-");
		Capture_Screenshot tss = (Capture_Screenshot)driver;
		File src= tss.getScreenshotAs(OutputType.FILE);
		File dst =new File(path+d2+".png");
		FileHandler.copy(src,dst);
	}
	catch (Exception e)
	{
	System.out.println(e);
	}

}

}

