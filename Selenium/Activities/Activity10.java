package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {
    public static void main(String[] args)
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("Title: "+driver.getTitle());
        WebElement checkbox=driver.findElement(By.name("toggled"));
        System.out.println("Before: "+checkbox.isDisplayed());
        driver.findElement(By.id("toggleCheckbox")).click();
        System.out.println("After: "+checkbox.isDisplayed());
        driver.close();

    }
}
