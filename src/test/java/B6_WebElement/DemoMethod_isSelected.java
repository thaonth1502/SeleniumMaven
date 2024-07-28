package B6_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoMethod_isSelected {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement checkboxDefault = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input"));
        boolean checkCheckboxDefault;

        checkCheckboxDefault = checkboxDefault.isSelected();
        System.out.println("Check Checkbox Default: " + checkCheckboxDefault);
        Thread.sleep(1000);
        checkboxDefault.click();
        checkCheckboxDefault = checkboxDefault.isSelected();
        System.out.println("Check checkbox default after: " + checkCheckboxDefault);
        Thread.sleep(1000);

        driver.quit();
    }
}
