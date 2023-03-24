package Basic6;

import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		
		}
}

