package SDW01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocateByPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//WebElement adLink = driver.findElement(By.partialLinkText("Ad"));
		//adLink.click();
		driver.findElement(By.partialLinkText("Ad")).click();
	}

}

