package SDW01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class De30amzonprintallheader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
            driver.get("https://www.amazon.in/");
		
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
		
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		driver.close();
	}

}