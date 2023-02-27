package Annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BAMethod {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  driver.get("http://triotend.com/tts/site/login");
  }
  @Test
  public void test() {
	  
	  driver.get("http://triotend.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  
	  Thread.sleep(4000);
	  driver.close();
  }

}
