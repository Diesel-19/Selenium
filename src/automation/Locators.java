package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Libraries/Desktop/java/SeleniumCourse/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("This is my first code");
		driver.findElement(By.name("pass")).sendKeys("This is the password");
		driver.findElement(By.linkText("Forgot Password?")).click();
	}
}
