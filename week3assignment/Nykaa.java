package week3assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.Implementation;

public class Nykaa {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(33));
		WebElement input = driver.findElement(By.xpath("//a[text()=\"brands\"]"));
		Actions build =new Actions(driver);
		build.moveToElement(input).perform();
		WebElement input2 = driver.findElement(By.linkText("L'Oreal Paris"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		Actions set =new Actions(driver);
		set .click(input2).click().perform();
		String title= driver.getTitle();
		System.out.println("title");
		driver.close();
		

	}

}
