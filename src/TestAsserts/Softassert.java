package TestAsserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Softassert {
  @Test
  public void SAT() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://triotend.com/tts/site/login");
	  
	  WebElement logo=driver.findElement(By.tagName("img"));
	  
	  //Assert.assertTrue(logo.isDisplayed());
	  //Assert.assertFalse(logo.isDisplayed());
	  
	  String Expectedtitle="Smart Hospital : Hospital Management ";
	  String Actualtitle=driver.getTitle();
	  
	  SoftAssert sft=new SoftAssert();
	  sft.assertEquals(Actualtitle, Expectedtitle);
	  
	  driver.findElement(By.cssSelector("input#email")).sendKeys("SoftAssert");
	 
	  sft.assertAll();
	  
  }
}
