package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Locators_Ex2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fieldglass.net/");
		Thread.sleep(3000);
		driver.findElement(By.id("usernameId_new")).sendKeys("NMTP");
		Thread.sleep(3000);
		driver.findElement(By.id("passwordId_new")).sendKeys("Fieldtimesheet2025");
		Thread.sleep(3000);
		driver.findElement(By.className("formLoginButton_new")).click();
	}

}
