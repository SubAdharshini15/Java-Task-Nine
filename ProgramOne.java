package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramOne {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("URL of Current Page : " + driver.getCurrentUrl());
		driver.navigate().refresh();
		driver.close();
	}
}
