package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Prakash9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='_396cs4']"));
		 WebElement ele = driver.findElement(By.xpath("//img[@alt='Appliances']"));
		 System.out.println(ele);

	}

}
