package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.*;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.chromedriver().driverVersion("100.0").setup();
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

        driver.get("https://selenium.dev");

//        driver.quit();

	}

}
