package TESTngpackage;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import NEW.Project.Base;

public class NewFunc {
	WebDriver dr; Base bs;
  @Test
  public void f() {
	  bs=new Base(dr);
	  bs.test();	  
  }
}
