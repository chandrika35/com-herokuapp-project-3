package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;
    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("FireFox")){
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        driver.get(baseUrl);
        //Maximise the Browser
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys("Sitaram123");
WebElement passwordField = driver.findElement(By.id("password"));
passwordField.sendKeys("sitaram");
driver.close();
    }
}
