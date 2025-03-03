package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText_Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Computers")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Desktops")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Build your own cheap computer")).click();
		
	}

}
