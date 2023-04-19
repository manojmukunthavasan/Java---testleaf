package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {
	/*
	 * 1. Launch https://www.snapdeal.com/ 2. Go to Mens Fashion 3. Go to Sports
	 * Shoes 4. Get the count of the sports shoes 5. Click Training shoes 6. Sort by
	 * Low to High 7. Check if the items displayed are sorted correctly 8.Select the
	 * price range (500-1200) 9.Filter with color yellow 10 verify the all applied
	 * filters 11. Mouse Hover on first resulting Training shoes 12. click QuickView
	 * button 13. Print the cost and the discount percentage 14. Take the snapshot
	 * of the shoes.
	 */

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("---disable-notification---");
        
		ChromeDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		//go to mens fashion
		WebElement ele = driver.findElement(By.xpath("(//span[contains(text(),'Men')])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
		//go to sports
		driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]")).click();
		WebElement sportshoes = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
        System.out.println(sportshoes);
        Thread.sleep(3000);
        //click training shoes
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        driver.findElement(By.xpath("//div[contains(@class,'sort-drop')]")).click();
        driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
        Thread.sleep(3000);
        
        String firstprice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
		String f1 = firstprice.replaceAll("Rs. ", "");
		int firstvalue = Integer.parseInt(f1);
		
		String secondprice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
		String s1 = secondprice.replaceAll("Rs. ", "");
		int secondvalue = Integer.parseInt(s1);
		
		if(firstvalue < secondvalue) {
			System.out.println("The item are sorted as expected");
		}else {
			System.out.println("The item are unsorted");
		}
		WebElement inpform = driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		inpform.clear();
		inpform.sendKeys("500");
		
		WebElement inpto = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		inpto.clear();
		inpto.sendKeys("1200");
		
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Navy']/parent::div")).click();
		Thread.sleep(3000);
		
		String filters = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();
		if(filters.contains("Price:") && filters.contains("Navy")){
			System.out.println("All filters are successfully applied");
		}	else {
			System.out.println("Filters are not applied");
		}
		
		WebElement ele2 = driver.findElement(By.xpath("//div[text()[normalize-space()='Quick View']]/following::p"));
		Actions quickView = new Actions(driver);
			quickView.moveToElement(ele2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@supc='SDL901001171'])[2]")).click();
		
		String currency = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]")).getText();
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(2000);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The price of the shoe is "+currency + price+ "with " +discount);
		
		driver.close();
	}

}
