package Assginment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.navigate().to("https://www.amazon.in/");
		 String title = driver.getTitle();
			System.out.println("Title: " + title);
			driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
			String kiran1 = driver.getTitle();
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
			String kiran2 = driver.getTitle();
			driver.navigate().back();
			driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
			String kiran3 = driver.getTitle();
			driver.navigate().forward();
			String newline = System.lineSeparator();
			System.out.println("Title: "+newline+kiran1 +newline+kiran2+ newline+kiran3);
	}

}
