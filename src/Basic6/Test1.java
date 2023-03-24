package Basic6;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
	    
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.actitime.com/");
		Dimension d = new Dimension(200,100);
		driver.manage().window().setSize(d);
		
		

	}

}
