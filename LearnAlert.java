package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Alert.html");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		 
		 Alert alert = driver.switchTo().alert();
		 Thread.sleep(2000);
		 alert.accept();
		 
		 
		 driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		 
		 Thread.sleep(2000);
		 
		 alert.accept();
		 
		 
		 driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		 
		 Thread.sleep(2000);
		 
		 alert.accept();
		 
		 

	}

}
