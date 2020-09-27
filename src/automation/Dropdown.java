package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/Libraries/Desktop/java/SeleniumCourse/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//IF TAG NAME IS SELECT
		driver.get("http://spicejet.com");
		Select s = new Select(driver.findElement(By.cssSelector("select[id='ctl00_mainContent_DropDownListCurrency']")));

		s.selectByValue("USD");
		s.selectByIndex(2);
		s.selectByVisibleText("USD");
		//if you are allowed to deselect
//		s.deselectByValue("");
	}
}
