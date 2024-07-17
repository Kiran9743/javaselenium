package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Assginment {
	WebDriver driver;
  @Test
  public void citi() {
	  driver.get("https://www.online.citibank.co.in/");
	  driver.findElement(By.xpath(" //*[@id=\"popup1\"]/div/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
	  driver.findElement(By.id("topMnubanking")).click();
	  driver.findElement(By.xpath("1")).click();
	
  
  }
  @BeforeMethod
  public void beforeMethod() {
  } 

  @AfterMethod
  public void afterMethod() {
	  List<WebElement> kiran = driver.findElements(By.xpath("//*[@id=\"bankingSubMenu\"]/div[1]/div[1]/ul/li"));
	  for(WebElement kira: kiran)
		  System.out.println(kira.getText());
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
