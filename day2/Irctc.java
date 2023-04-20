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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("---disable notifications");
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> allLink = new ArrayList<String>(windowHandles);
		
		WebDriver window = driver.switchTo().window(allLink.get(1));
		System.out.println(window);
		String title = driver.getTitle();
		System.out.println(title);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/s.img");
		FileUtils.copyFile(src, dst);
		
		driver.close();
		
		driver.switchTo().window(allLink.get(0));
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		driver.quit();
	}

}
