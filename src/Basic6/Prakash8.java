package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.util.internal.SystemPropertyUtil;

public class Prakash8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","./Drives/chromedriver.exe");
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		/*Dimension ele = driver.findElement(By.id("username")).getSize();
		System.out.println(ele.getWidth());
		System.out.println(ele.getHeight());*/
		
		/*Point ele = driver.findElement(By.id("username")).getLocation();
		System.out.println(ele.getX());
		System.out.println(ele.getY());*/
		
		Rectangle ele = driver.findElement(By.id("username")).getRect();
		System.out.println(ele.getWidth());
		System.out.println(ele.getHeight());
		System.out.println(ele.getX());
		System.out.println(ele.getY());

	}
	
	
}
