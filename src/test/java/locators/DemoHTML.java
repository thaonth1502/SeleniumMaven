package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoHTML {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.id("email")).sendKeys("admin@example.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("remember")).click();
        driver.findElement(By.tagName("button")).click();
        driver.quit();

    }
}
