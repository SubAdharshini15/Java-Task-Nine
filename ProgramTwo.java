package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramTwo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//title[contains(text(),'STORE')]"));
		String title = driver.getTitle();
		System.out.println("Title of Current Page is : " + title);
		if (title.equalsIgnoreCase("STORE")) {
			System.out.println("Page landed on correct webpage");
		} else {
			System.out.println("Page not landed on correct webpage");
		}

	}
}