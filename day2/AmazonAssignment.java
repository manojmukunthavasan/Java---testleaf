package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeOptions apt=new ChromeOptions();
		apt.addArguments("--disable-notifications--");
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//		2.search as oneplus 9 pro 
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Oneplus 9 pro");
		driver.findElement(By.xpath("//span[@id='nav-search-submit-text']")).click();
       //		3.Get the price of the first product   	
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Mobile price is: "+price);
        Thread.sleep(3000);
        //		4. Print the number of customer ratings for the first displayed product
         WebElement rating = driver.findElement(By.xpath("//span[text()='3.0 out of 5 stars']"));
         Actions hover = new Actions(driver);
         Thread.sleep(3000);
		 hover.moveToElement(rating).click().perform();
		//	5. Click the first text link of the first image
		 
		//String rating2 = driver.findElement(By.xpath("a-icon-row a-spacing-small a-padding-none")).getText();
		//System.out.println("Customer Ratings:"+rating2); 
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> obj = new ArrayList<String>(windowHandles);
		driver.switchTo().window(obj.get(1));
		Thread.sleep(2000);
//		6. Take a screen shot of the product displayed
		File ss = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/screenshot.png");
		FileUtils.copyFile(ss, des);
		
//		7. Click 'Add to Cart' button
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
//		8. Get the cart subtotal and verify if it is correct.
		WebElement findElement = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		String text1 = findElement.getText();
		if(price.equals(text1)) {
			System.out.println("The sub total is verified and matched");
		}else {
			System.out.println("The sub total is mis matched");
		}
//		9.close the browser
		driver.quit();
	}

}
