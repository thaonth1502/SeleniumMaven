package B6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;

public class DemoMethod_isEnabled {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        driver.findElement(By.xpath("//span[normalize-space() ='Run this project']")).click();
        Thread.sleep(1000);

        boolean checkSubmitButton = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check submit Button: " + checkSubmitButton);

        Thread.sleep(1000);

        boolean checkHackedSubmitButton = driver.findElement(By.xpath("//button[normalize-space()='\"Hacked\" Submit button']")).isEnabled();
        System.out.println("Check Hacked Submit Button: " + checkHackedSubmitButton);

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        boolean checkSubmitButonAfter = driver.findElement(By.xpath("//button[normalize-space()='Submit']")).isEnabled();
        System.out.println("Check Submit Button: " + checkSubmitButonAfter);


        driver.quit();
    }
}
