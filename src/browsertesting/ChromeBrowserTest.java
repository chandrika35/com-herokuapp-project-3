package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current URL:" + driver.getCurrentUrl());
        WebElement usernameFIeld = driver.findElement(By.name("username"));
        usernameFIeld.sendKeys("Sitaram123");
WebElement psssWordField = driver.findElement(By.name("password"));
psssWordField.sendKeys("sitaram123");

driver.close();
    }
}