package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etrain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://erail.in/");

		Thread.sleep(3000);
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("ms");
		driver.findElement(By.xpath("//div[text()='Chennai Egmore']")).click();
		
		WebElement dest = driver.findElement(By.id("txtStationTo"));
		dest.clear();
		dest.sendKeys("cbe");
		driver.findElement(By.xpath("//div[text()='Coimbatore Jn']")).click();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		System.out.println("---print the first column---");
		List<WebElement> column = driver.findElements(By.xpath("//*[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		int col = column.size();
		System.out.println("Total Trains = " +col);
		
		for (int i = 1; i <=col; i++) {
			String name = driver.findElement(By.xpath("//*[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody//tr[\"+i+\"]/td[2]/a")).getText();
			System.out.println(name);
			
			
		}
		
		driver.close();
		
	}

}
