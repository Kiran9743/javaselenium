package finaltestng;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testng02 
{	
	WebDriver driver;

	@Test
	  public void login() throws InterruptedException {
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");		
	driver.findElement(By.name("radioButton")).click();
	List<WebElement> kiran = driver.findElements(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/legend"));
	for (WebElement radio : kiran)
	{
		System.out.println("radiobutto selected : "+ radio.getText());
	}
	WebElement india =driver.findElement(By.id("autocomplete"));
	india.click();
	india.sendKeys("ind");
	driver.findElement(By.className("ui-menu-item-wrapper")).click();
	
}

@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
}
}