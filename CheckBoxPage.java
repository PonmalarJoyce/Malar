package week2.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		 String checked1 = driver.getTitle();

			if(checked1.equals(checked1)) {
				System.out.println("Selenium is checked");
			}
			else
				System.out.println("Selenium is not checked");
			
		
		//WebElement deSelect = driver.findElement(By.xpath("(//label[text()='DeSelect only checked']"));
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			
		
			
		
		
		driver.findElement(By.xpath("(//input[@name='age'])[1]")).click();

	}

}
