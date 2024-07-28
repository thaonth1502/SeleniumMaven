package B6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3MethodsCheckElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com");

        boolean checkElement = driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']")).isDisplayed();
        System.out.println("Check Display: " + checkElement);

        boolean checkLoginButton = driver.findElement(By.xpath("//a[@id='btn-login']")).isDisplayed();
        System.out.println("Check Login Button: " + checkLoginButton);

        Thread.sleep(1000);

        driver.quit();
    }
}
