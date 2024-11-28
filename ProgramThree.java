package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramThree {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		WebElement searchElement = driver.findElement(By.id("searchInput"));
		searchElement.sendKeys("Artificial Intelligence");
		searchElement.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement historyElement = driver.findElement(By.xpath("(//a[@class='vector-toc-link']//div[@class='vector-toc-text']//span[contains(text(),'History')])[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", historyElement);
		historyElement.click();
		String title1 = driver.getTitle();
		System.out.println("Title of the section is : " + title1);
		driver.quit();

	}
}
