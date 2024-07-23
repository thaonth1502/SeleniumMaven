import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/authentication/login");
        Thread.sleep(2000);
        //Input email
        driver.findElement(By.id("email")).sendKeys("admin@exmple.com");
        Thread.sleep(2000);
        //Input password
        driver.findElement(By.id("password")).sendKeys("123456");
        Thread.sleep(2000);
        //Click Login button
        driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        Thread.sleep(2000);
        driver.quit();
    }

}
