package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prakash2 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		
		WebElement pass = driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login']"));
		driver.findElement(By.xpath(null));
		

	}

}
