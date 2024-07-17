package Assginment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DC01rightclickdisplayerror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		 Actions act = new Actions(driver);
		 WebElement kiran = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		 act.contextClick(kiran).perform();
		 List<WebElement> raja = driver.findElements(By.cssSelector("#authentication > ul > li"));
		 for(WebElement r :raja)
			 System.out.println(r.getText());
			 
		WebElement doubliclick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		
		 act.doubleClick(doubliclick).perform();
		//Switch to the alert box and click on OK button
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();
		//Closing the driver instance
		//driver.quit();
	}
}
