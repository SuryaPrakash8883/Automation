package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Autoframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Text1");
		driver.switchTo().frame("frm1");
		Select s1=new Select(driver.findElement(By.id("course")));
		s1.selectByValue("java");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Text2");
		Thread.sleep(2000);
		driver.switchTo().frame("frm3").switchTo().frame("frm1");
		Select s2=new Select(driver.findElement(By.id("selectnav1")));
		s2.selectByVisibleText("Tech News");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm3").switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Surya Prakash");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Task done");
	}
}
