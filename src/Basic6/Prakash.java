package Basic6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prakash {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/doodles/hungary-national-day-2023");
		driver.findElement(By.linkText("//www.google.com/logos/doodles/2023/hungary-national-day-2023-6753651837109679-2xa.gif")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("//www.google.com/logos/doodles/2023/paz-marquez-benitezs-129th-birthday-6753651837109848-2xa.gif")).click();

	}

}
