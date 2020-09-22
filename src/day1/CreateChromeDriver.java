package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateChromeDriver {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Libraries/Desktop/java/SeleniumCourse/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	}
}
