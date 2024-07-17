package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Rahulsheety {
	WebDriver driver;
  @Test
  public void loging() throws InterruptedException {
	  driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div/form/input")).sendKeys("Cucumber");
	  driver.findElement(By.xpath("//header/div[1]/div[2]/form[1]/button[1]")).click();
	  driver.findElement(By.className("increment")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
	  driver.findElement(By.className("cart-icon")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
	  Thread.sleep(10000);
	  List<WebElement> raja = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/table/tbody/tr/td"));
		 for(WebElement k : raja)
			System.out.println("details"+k.getText()); 
driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
WebElement kiran =driver.findElement(By.xpath("//label[contains(text(),'Choose Country')]"));
System.out.println(kiran.getText());
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).click();
List<WebElement> rama = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div/select"));
for(WebElement kirshna : rama) {
System.out.println("total countries"+ kirshna.getSize());
//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select/option[89]")).click();
List<WebElement> kavya = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select/option[89]"));
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select/option[89]")).click();
int i=0;
for(WebElement country : kavya)
{
	System.out.println(i + ". " + country.getText());
	i++;
}

//kavya.selectByVisibleText("United States");


	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
	}
}


  @AfterMethod
  public void afterMethod() {
	 
	  driver.close();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
  }

  @AfterTest
  public void afterTest() {
  }

}
