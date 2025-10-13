package navigate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		Thread.sleep(2000);
		driver.findElement(By.className("gLFyf")).sendKeys("HYR tutoirials");
		Thread.sleep(2000);
		driver.findElement(By.className("gLFyf")).submit();
		Thread.sleep(2000);
		driver.navigate().to("https://facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("211FA07036@gmail.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
	}

}
