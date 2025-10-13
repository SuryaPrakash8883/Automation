package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prtc2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement drop=driver.findElement(By.id("course"));
        Thread.sleep(3000);
        Select dropdown=new Select(drop);
        
        List<WebElement>lstdropdown=dropdown.getOptions();
        for(WebElement options: lstdropdown) {
        	System.out.println(options.getText());
        }
        dropdown.selectByIndex(1);
        Thread.sleep(3000);
        dropdown.selectByValue("python");
        Thread.sleep(3000);
        dropdown.selectByVisibleText("Dot Net");
        Thread.sleep(3000);
        String frstselect=dropdown.getFirstSelectedOption().getText();
        System.out.println(frstselect);      
    }
}
