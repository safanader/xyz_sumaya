package xyz_sumaya_again;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		driver.manage().window().maximize();

	}

}
