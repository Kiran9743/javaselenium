package Testng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D03Before_AfterTest {
	WebDriver driver;
	@Test
  public void login() throws InterruptedException {
		driver.get("https://demoqa.com/automation-practice-form");
		System.out.println("Title: " + driver.getTitle());
	 driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[2]/div[2]/*[1]")).click();
	  driver.findElement(By.id("item-0")).click();
	 driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
	Thread.sleep(2000);
	}
	  @DataProvider
	 public void data(String name) {
		  driver.switchTo().frame(0);
	driver.findElement(By.id("userName")).sendKeys("kiran N");
	 driver.findElement(By.id("userEmail")).sendKeys("kirann9632@gmail.com");
	 driver.findElement(By.id("submit")).click();
	List<WebElement> kiran = driver.findElements(By.xpath("//*[@id=\"output\"]/div"));
	 
	  }
	  @AfterMethod
	  public void aftermethod()
	  {
		  List<WebElement> kiran = driver.findElements(By.xpath("//*[@id=\"output\"]/div"));
		  for(WebElement k: kiran)
				System.out.println(k.getText());

 }
	@BeforeTest 
	public void beforeTest()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
}
