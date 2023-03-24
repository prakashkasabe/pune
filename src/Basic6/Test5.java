package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Grocery']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		
	}

	
}
