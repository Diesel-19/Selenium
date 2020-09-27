package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UpdatedDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Libraries/Desktop/java/SeleniumCourse/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://spicejet.com");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("divpaxinfo")));
		driver.findElement(By.id("divpaxinfo")).click();
		Select s = new Select(driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
		s.selectByIndex(4); // picks 5th option
		driver.findElement(By.id("divpaxinfo")).click();
	}
}
