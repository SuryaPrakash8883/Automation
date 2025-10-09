package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prtc2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
        WebElement user=driver.findElement(By.id("firstName"));
        if(user.isDisplayed()) {
        	if(user.isEnabled()) {
        		user.sendKeys("Surya Prakash");
        		String name=user.getAttribute("value");
        		System.out.println(name);
        		Thread.sleep(3000);
        		//user.clear();
        	}
        	
        }else {
        	System.err.println("Field does not exists");
        }
        WebElement fmale=driver.findElement(By.id("femalerb"));
        if(fmale.isDisplayed()) {
        	fmale.click();
        	System.out.println("Female is selected");
        }
        Thread.sleep(3000);
        driver.findElement(By.id("englishchbx")).click();
        WebElement hindi=driver.findElement(By.id("hindichbx"));
        hindi.click();
        Thread.sleep(3000);
        if(hindi.isSelected()) {
        	hindi.click();
        }
        Thread.sleep(3000);
        driver.findElement(By.id("registerbtn")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.id("msg")).getText());
        Thread.sleep(3000);
        driver.findElement(By.linkText("Click here to navigate to the home page")).click();
    }
}
