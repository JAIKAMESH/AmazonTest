package Docker_Project;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ChromeAmazonLogn {
  @Test
  public void f() throws MalformedURLException, InterruptedException {
	  ChromeOptions op=new ChromeOptions();
	  Reporter.log("Before Server Start", true);
	  
	  WebDriver dr=new RemoteWebDriver(new URL("http://localhost:4444"),op);
	  Thread.sleep(5000);
	  dr.get("https://sampleapp.tricentis.com/101/index.php");
	  Thread.sleep(5000);
	  System.out.println(dr.getTitle());
	  Reporter.log("Login Successfully", true);
	  
	  dr.findElement(By.id("nav_automobile")).click();
	  Thread.sleep(5000);
	  dr.getCurrentUrl();	
	  Reporter.log("Testing completed", true);
	  
	  dr.close();
	  Reporter.log("Browser closed", true);
  }
}
