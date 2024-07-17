package Testng;

import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Rahulsheety2 {
	private static final byte[] expectedText = null;
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String pas, String name,String mail) throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[1]/input")).sendKeys(name);
		 driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/div[2]/input")).sendKeys(mail);
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys(pas);
		 driver.findElement(By.id("exampleCheck1")).click();
		 driver.findElement(By.id("exampleFormControlSelect1")).click();
		 driver.findElement(By.id("inlineRadio1")).click();
		 driver.findElement(By.xpath("//body/app-root[1]/form-comp[1]/div[1]/form[1]/div[7]/input[1]")).sendKeys("22071996");
		 driver.findElement(By.xpath("//body[1]/app-root[1]/form-comp[1]/div[1]/form[1]/input[1]")).click();
		 List<WebElement> errormessage = driver.findElements(By.xpath("/html/body/app-root/form-comp/div/div[2]/div"));
		 for(WebElement k : errormessage)
		 {
			 
			 System.out.println((k.getText()));
		 }
		
  }
 

  @AfterMethod
  public void afterMethod()  {
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "kiran", "kiran" , "kirann9632@gmail.com"},
      
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		
  }

  @AfterTest
  public void afterTest() {
  }

}
