package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---disable notifications---");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nykaa.com/");
		
//		2) Mouseover on Brands and Search L'Oreal Paris
     	WebElement mouseover = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions brands = new Actions(driver);
        brands.moveToElement(mouseover).perform();
        Thread.sleep(2000);
        
//    	3) Click L'Oreal Paris
        driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
        Thread.sleep(1000);

//    	4) Check the title contains L'Oreal Paris(Hint-GetTitle)
        driver.findElement(By.xpath("(//a[contains(text(),'Oreal Paris')])[2]")).sendKeys(Keys.ENTER);
        String Loreal = driver.getTitle();
        if(Loreal.contains("L'Oreal Paris")) {
        	System.out.println("The title is correct");
        }else {
        	System.out.println("The page is not loaded");
        }
//    	5) Click sort By and select customer top rated
        driver.findElement(By.xpath("//button[contains(@class,'1aucgde')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//label[@class='control control-radio'])[4]")).click();
        Thread.sleep(1000);
//    	6) Click Category and click Hair->Click haircare->Shampoo   
        driver.findElement(By.xpath("//span[text()='Category']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@class='filter-name '])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//label[@class='control control-checkbox'])[2]")).click();
        Thread.sleep(1000);
//    	7) Click->Concern->Color Protection  
        driver.findElement(By.xpath("//span[text()='Concern']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764']//div)[2]")).click();
        Thread.sleep(1000);
//    	8)check whether the Filter is applied with Shampoo   
        String filter = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
        System.out.println(filter);
        if(filter.contains("shampoo")) {
        	System.out.println("Filter has shampoo value");
        }else {
        	System.out.println("Filter is not applied");
        }
        Thread.sleep(1000);
//    	9) Click on L'Oreal Paris Colour Protect Shampoo 
        driver.findElement(By.xpath("(//div[@class='css-ifdzs8']//div)")).click();
//	10) GO to the new window and select size as 175ml
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>newPage = new ArrayList<String>(windowHandles);
        driver.switchTo().window(newPage.get(1));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='180ml']")).click();
//    	11) Print the MRP of the product     
        String mrp = driver.findElement(By.xpath("//div[@class='css-f5j3vf']")).getText();
        System.out.println(mrp);
//	12) Click on ADD to BAG
        driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
//  13) Go to Shopping Bag        
        driver.findElement(By.xpath("//button[@class='css-aesrxy']")).click();
        driver.switchTo().frame(0);
//  14) Print the Grand Total amount        
        String total = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
        System.out.println(total);
        Thread.sleep(2000);
//	15) Click Proceed
        driver.findElement(By.xpath("(//button[@class='css-1j2bj5f e8tshxd0'])[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//button[@class='css-110s749 e8tshxd1'])[2]")).click();
		driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='css-1b232xc ehes2bo3']//img)[2]")).click();
		String youPay = driver.findElement(By.xpath("(//div[@class='css-vlqrtx e1d9ugpt3']/p)[3]")).getText();
		System.out.println(youPay);
			if(youPay.equals(total)) {
				System.out.println("The grand total is the same");
			}else {
				System.out.println("Grand total value has changed");
			}
			driver.quit();

		
		
	}

}
