package Screenshot_Capture;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotTake {
	public static void Take(WebDriver dr) 
	{
		TakesScreenshot ts=(TakesScreenshot) dr;
		File SystemScreenshot=ts.getScreenshotAs(OutputType.FILE);
		File ActualScreenshot=new File("C:\\Eclipse Java\\Project\\Screenshots\\Pic"+System.currentTimeMillis()+".png");
		try {FileHandler.copy(SystemScreenshot, ActualScreenshot);}
		catch (IOException e){e.printStackTrace();}
	}
}
