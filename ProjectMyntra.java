package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectMyntra {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 2) Mouse hover on MeN

		WebElement webMen = driver.findElement(By.xpath("//a[text()='Men'][1]"));

		Actions builder = new Actions(driver);
		builder.moveToElement(webMen).perform();

		Thread.sleep(2000);
		// 3) Click Jackets

		driver.findElement(By.xpath("//a[text()='Jackets']")).click();
		// Find the total count of item

		String text = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println(text);

		String replaceAll = text.replaceAll("[^0-9]", "");
		int count = Integer.parseInt(replaceAll);
		System.out.println(count);
		System.out.println("Total count:" + count);

		// Validate the sum of categories count matches

		String jackets = driver.findElement(By.xpath("//label[text()='Jackets']")).getText();
		System.out.println(jackets);

		String replaceAll1 = jackets.replaceAll("[^0-9]", "");
		int parseInt2 = Integer.parseInt(replaceAll1);
		System.out.println(parseInt2);
		System.out.println("Number of jackets:" + parseInt2);

		String rainJacket = driver.findElement(By.xpath("//label[contains(text(),'Rain Jacket')]")).getText();
		System.out.println(rainJacket);

		String replaceAll2 = rainJacket.replaceAll("[^0-9]", "");
		int parseInt3 = Integer.parseInt(replaceAll2);
		System.out.println(parseInt3);
		System.out.println("Number of Rain jackets:" + parseInt3);

		int Sum = parseInt2 + parseInt3;

		if (count == Sum) {

			System.out.println("Matches");
		} else
			System.out.println("Count not matches");

		// Check jackets

		WebElement input = driver.findElement(By.className("common-checkboxIndicator"));

		input.click();

		// Click + More option under BRAND

		driver.findElement(By.className("brand-more")).click();

		// Type Duke and click checkbox

		driver.findElement(By.className("FilterDirectory-searchInput")).sendKeys("Duke");
		
		WebElement input1 = driver.findElement(By.className("common-customCheckbox"));

		input1.click();

		// Close the pop-up x

		WebElement close = driver
				.findElement(By.xpath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']"));

		close.click();
		
		
		// Confirm all the Coats are of brand Duke
		
		List<WebElement> brand = driver.findElements(By.xpath("//h3[contains(text(),'Duke')]"));
		List<String> brands = new ArrayList<String>();
		String brand1 = "Duke";
		
		for (int i = 0; i < brand.size(); i++) {
			
			String duke = brand.get(i).getText();
			
			if (duke.equals(brand1)) {
				
				brands.add(duke);
			}
		}

		System.out.println("All the brand names in selected items are" + brand1);
		
		// Sort by Better Discount
		
		WebElement sort1 = driver.findElement(By.className("sort-sortBy"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(sort1).perform();
		
		WebElement sort = driver.findElementByXPath("//div[@class='horizontal-filters-sortContainer']");
		
		WebElement better = driver.findElementByXPath("//label[text()='Better Discount']");
		
		WebElement move = driver.findElementByXPath("//ul[@class='atsa-filters']");
		
		builder.moveToElement(sort).moveToElement(better).click(better).moveToElement(move).perform();
		
		//Find the price of first displayed item
		
		List<WebElement> rate1 = driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		
		String price = rate1.get(0).getText();
		
		System.out.println("The price of first item: " + price);
		

		//Click on the first product
		driver.findElement(By.xpath("//div[@class='product-productMetaInfo']{1]")).click();

		//Take a screen shot
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("./snaps/coat.png");
		
		FileUtils.copyFile(src1,dst);
		
		//Click on WishList Now
		
		WebElement select = driver.findElement(By.className("myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center "));
		
		select.click();
		
		//Close Browser
		
		driver.close();
		
		

	}

}
