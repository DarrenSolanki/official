package frameWork;

import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.*;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().driverVersion("93.0.4577.63").setup();
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        String windowId = driver.getWindowHandle();
        driver.get("https://selenium.dev");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println("WindowId is : "+windowId);
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(5000);
        driver.switchTo().window(windowId);

        driver.quit();
      

	}

}
