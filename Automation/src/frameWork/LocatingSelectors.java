package frameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatingSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		System.out.println(list.size());
		for(WebElement element : list) {
			System.out.println(element.getText());
			if(element.getText() == "mobile phone under 15000") {
				element.click();
			}
		}
		
	}

}
