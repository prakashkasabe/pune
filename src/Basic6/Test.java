package Basic6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		Dimension ele = driver.manage().window().getSize();
		System.out.println("Width = "+ele.getWidth());
		System.out.println("Height = "+ele.getHeight());
		
		
		

	}

}
 