package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {
	
	private static final String Appium = null;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 //locate the web element
		 
		 WebElement drop1 = driver.findElement(By.id("dropdown1"));
		 
		 Select drpDwn = new Select(drop1);
		 
		 //three ways to select the 3 ways
		 
		 drpDwn.selectByIndex(1);
		 //drpDwn.selectByIndex(null); 
		 //drpDwn.selectByValue(null);
		 //drpDwn.selectByVisibleText(null);
		 
         WebElement drop2 = driver.findElement(By.name("dropdown2"));
		 
		 Select drpDwn1 = new Select(drop2);
		 
		 drpDwn1.selectByVisibleText(Appium);
		 
         WebElement drop3 = driver.findElement(By.name("dropdown3"));
		 
		 Select drpDwn2 = new Select(drop3);
		 
		 drpDwn2.selectByValue("4");
		 
		 
		 
		 
	}

}
