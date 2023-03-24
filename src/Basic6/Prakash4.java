package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prakash4 {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		String ele = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(ele.isEmpty());
		
//		String ele = driver.findElement(By.id("headerContainer")).getText();
//		System.out.println(ele);
		
		driver.close();

	}

}