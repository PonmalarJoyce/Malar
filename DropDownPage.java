package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPage {

	private static final String Selenium = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leafground.com/pages/Dropdown.html");
		
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 WebElement drop = driver.findElement(By.id("dropdown1"));
		 
		 Select drpDwn = new Select(drop);
	
		 drpDwn.selectByIndex(1);
		 
         WebElement drop1 = driver.findElement(By.xpath("//option[text()='Select training program using Text']]"));
		 
		 Select drpDwn1 = new Select(drop1);
	
		 drpDwn1.selectByVisibleText(Selenium);
		 
         WebElement drop2 = driver.findElement(By.name("dropdown3"));
		 
		 Select drpDwn2 = new Select(drop2);
	
		 drpDwn2.selectByValue("1");

	}

}
