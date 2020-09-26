package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Libraries/Desktop/java/SeleniumCourse/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com");
		
		driver.findElement(By.cssSelector("yt-formatted-string#text")).click();
		driver.findElement(By.cssSelector("span.RveJvd.snByac")).click();
		driver.findElement(By.cssSelector("input#search")).sendKeys("We will rock you");
		driver.findElement(By.cssSelector("yt-formatted-string.style-scope.ytd-video-renderer")).click();
		driver.findElement(By.cssSelector("yt-icon.style-scope.ytd-toggle-button-renderer")).click();

	}
}
