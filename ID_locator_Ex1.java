package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_locator_Ex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypayroll.myndsolution.com/Login.aspx");
		Thread.sleep(3000);
		driver.findElement(By.id("ucLogin_txtUserID")).sendKeys("27177");
		Thread.sleep(3000);
		driver.findElement(By.id("ucLogin_txtUserPWD")).sendKeys("Sigma@1234");
		Thread.sleep(3000);
		driver.findElement(By.id("ucLogin_txtCompCode")).sendKeys("Capco");
		Thread.sleep(3000);
		driver.findElement(By.id("ucLogin_btnLogin")).click();
	}

}
