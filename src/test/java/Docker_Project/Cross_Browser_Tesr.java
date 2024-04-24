package Docker_Project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;

public class Cross_Browser_Tesr { WebDriver dr;
@Parameters({"BrowserName"})


  @Test
  public void f(String BrowserName) throws MalformedURLException, InterruptedException {
  Reporter.log("Before Server Start", true);

 if(BrowserName.equalsIgnoreCase("chrome")) 
	 dr=new RemoteWebDriver(new URL("http://localhost:4444"),new ChromeOptions());
   
 else if(BrowserName.equalsIgnoreCase("edge")) 
	 dr=new RemoteWebDriver(new URL("http://localhost:4444"),new EdgeOptions());
	 
 else if(BrowserName.equalsIgnoreCase("firefox")) 
	 dr=new RemoteWebDriver(new URL("http://localhost:4444"),new FirefoxOptions());
	   
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
}}
