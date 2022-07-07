package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JsExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement button = 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
//		js.executeScript("arguments[0].click();", button);

	}

}
