package SDW01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sd02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		 String title = driver.getTitle();
		 System.out.println("title: "+title);
	       if(title.equals("Swag Labs"))
	    	   System.out.println("Test case pass: )");
	       else
	    	   System.out.println("Test case fail :(");
	       driver.findElement(By.id("user-name")).sendKeys("standard_user");
	       driver.findElement(By.id("password")).sendKeys("secret_sauce");
	       driver.findElement(By.id("login-button")).click();
	       driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
	       driver.findElement(By.id("add-to-cart")).click();
	       driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
	       driver.findElement(By.id("checkout")).click();
	       driver.findElement(By.id("first-name")).sendKeys("kiran");
	       driver.findElement(By.id("last-name")).sendKeys("N");
	       driver.findElement(By.id("postal-code")).sendKeys("560037");
	       driver.findElement(By.id("continue")).click();
	       driver.findElement(By.id("finish")).click();
	      
	       
	       driver.findElement(By.id("back-to-products")).click();
	    //   PointerInput mouse = new PointerInput(PointerInput.Kind.MOUSE, "default mouse");

	      
	    // driver.close();
	}


	}


