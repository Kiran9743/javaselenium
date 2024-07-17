package finaltestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Testng01 {
	WebDriver driver;
	

  @Test
  public void username(String ps) {
	   driver.findElement(By.xpath("//*[@id=\"radio-btn-example\"]/fieldset/label[1]/input")).click();
		//Select countries = new Select(drpList);
		
		//System.out.println("Selected Country: " + countries.getFirstSelectedOption().getText());
		
	//	List<WebElement>countryList =  countries.getOptions();
		//List of all the countries in the drplist
		//System.out.println("Total Countries: " + countryList.size());;
  
  }

}
