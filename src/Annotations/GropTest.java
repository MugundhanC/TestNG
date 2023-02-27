package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GropTest {
  @Test(groups = {"ERP"})
  public void f() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://triotend.com/tts/site/login");
	  
	  driver.close();
  }
  @Test(groups = {"Website"})
  public void f1(){
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://triotend.com");
	  
	  driver.close();
  }
  @Test(groups = {"ERP"})
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://triotend.com");
	  
	  driver.close();
  }
}
