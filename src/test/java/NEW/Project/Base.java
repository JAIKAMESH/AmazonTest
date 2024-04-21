package NEW.Project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
WebDriver dr;


public Base(WebDriver dr) {
	this.dr = dr;
}


public void test()
{
	dr=new ChromeDriver();
	dr.get("https://demo.automationtesting.in/Register.html");
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println(dr.getTitle());
	
	dr.close();
}
}
