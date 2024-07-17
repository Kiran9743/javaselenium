package Refrencepracatice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01printmenu {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/jmeter-tutorial");
		
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"link\"]/div/ul/li[17]"));
		
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		driver.close();
	}

}