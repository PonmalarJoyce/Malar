package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/frame.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement frame1 = driver.findElement(By.xpath("//div[@id='wrapframe'][1]/iframe"));
		 
		 driver.switchTo().frame(frame1);
		 
		 driver.findElement(By.xpath("//button[@id='Click']")).click();
		 
		 driver.switchTo().defaultContent();
		 
		 //Nested frame 1
		 
		 
		 WebElement nestedframe1 = driver.findElement(By.xpath("//div[@id='wrapframe'][2]/iframe"));
		 
		 driver.switchTo().frame(nestedframe1);
		 
		 driver.switchTo().frame("frame2");
		 
		 driver.findElement(By.id("Click1")).click();
		 
		 driver.switchTo().defaultContent();
		 
		//Nested frame 2
		 
		 
		 WebElement nestedframe2 = driver.findElement(By.xpath("//div[@id='wrapframe'][3]/iframe"));
		 
		 driver.switchTo().frame(nestedframe2);
		 
		 driver.switchTo().frame("frame2");
		 
		 driver.findElement(By.id("Click1")).click();
		 
		 driver.switchTo().defaultContent(); 
		 
	

	}

}
