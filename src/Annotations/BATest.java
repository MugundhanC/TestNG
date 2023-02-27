package Annotations;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BATest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.selenium.dev/");
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }

}
