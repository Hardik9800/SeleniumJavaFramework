import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+ "/drivers/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
	WebElement textbox=	driver.findElement(By.id("lst-ib"));
		
		 textbox.sendKeys("Automation step by step");
		
		driver.close();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
