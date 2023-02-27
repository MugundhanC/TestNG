package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
  @Test
  public void f() {
	  
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver=new FirefoxDriver();
	  
	  driver.get("http://triotend.com/tts/admin/appointment/search");
	  
	  driver.close();
  }
  @Test
  public void f1() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://triotend.com");
	
	driver.close();
  }
  
  
  }
