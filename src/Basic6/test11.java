package Basic6;

import org.openqa.selenium.chrome.ChromeDriver;

public class test11 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://majhinaukri.in/indian-army-agniveer-recruitment-rally/#Agriveer");
		String actualpagesource = driver.getPageSource();
		System.out.println(actualpagesource);
	}

}

