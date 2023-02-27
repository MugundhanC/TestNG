package Annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class BAClass {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://triotend.com/tts/site/login");
  }
  @Test
  public void test() {
	  driver.get("http://triotend.com");
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }

}
