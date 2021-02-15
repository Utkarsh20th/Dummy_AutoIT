package automationFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt_AutoRecord {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\8726050876\\Downloads\\FreeSoftwares\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String url = "https://demoqa.com/modal-dialogs";
		driver.get(url);
		
		WebElement ele1 = driver.findElement(By.id("showLargeModal"));
		ele1.click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\8726050876\\Documents\\AutoIt_UtkarshScripts\\Test3");
		Thread.sleep(30000);
		
		driver.close();

	}

}
