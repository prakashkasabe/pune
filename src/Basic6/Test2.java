package Basic6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
//		Point ele = driver.manage().window().getPosition();
//		System.out.println("Start-X = " +ele.getX());
//		System.out.println("Start-Y = " +ele.getY());
		
//		driver.manage().window().getPosition(d);
		Point p = new Point(50,300); 
		
		driver.manage().window().setPosition(p);
		
	}

}