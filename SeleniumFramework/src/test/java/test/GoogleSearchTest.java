package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
public class GoogleSearchTest {

	private	static WebDriver driver = null;

	public static void main(String[] args) {
		googlesearch();
	}


	public static void googlesearch() {


		String projectPath= System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",projectPath+ "/drivers/chromedriver/chromedriver.exe");

		driver=new ChromeDriver();

		driver.get("https://www.google.co.in/");

		//driver.findElement(By.name("q")).sendKeys("Automation step by step");

		GoogleSearchPage.textbox_seach(driver).sendKeys("Automation step by step");

		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

		GoogleSearchPage.button_seach(driver).sendKeys(Keys.RETURN);

		driver.close();

		System.out.println("Test completed successfully");
	}
}
