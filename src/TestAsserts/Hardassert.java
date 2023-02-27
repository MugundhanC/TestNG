package TestAsserts;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Hardassert {
	@Test
	public void HAT() {
		
		
	WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("http://triotend.com/tts/site/login");
	  
	  WebElement logo=driver.findElement(By.tagName("img"));
	  
	  //Assert.assertTrue(logo.isDisplayed());
	  //Assert.assertFalse(logo.isDisplayed());
	  
	  String Expectedtitle="Smart Hospital : Hospital Management System";
	  String Actualtitle=driver.getTitle();
	  
	  Assert.assertEquals(Actualtitle, Expectedtitle);
	  
	  driver.findElement(By.cssSelector("input#email")).sendKeys("HardAssert");

	}
}
