package week3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(66));
		WebElement input = driver.findElement(By.id("Men's Fashion"));
		Actions build =new Actions(driver);
		build.moveToElement(input).perform();
		WebElement set = driver.findElement(By.linkText("Sports Shoes"));
		Actions build1 =new Actions(driver);
		build1.click(set).perform();
		// TODO Auto-generated method stub

	}

}
