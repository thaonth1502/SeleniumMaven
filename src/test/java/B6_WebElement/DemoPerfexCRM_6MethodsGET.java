package B6_WebElement;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoPerfexCRM_6MethodsGET {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        //getText()
        String headerLogin =  driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getText();
        System.out.println("Header Login: " + headerLogin);



        //getTagName()
        String getTabNameHTML =  driver.findElement(By.xpath("//h1[normalize-space()='Login']")).getTagName();
        System.out.println("Tag Name: " + getTabNameHTML);

        //getCssValue()
        WebElement bnt_Login =  driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        String backgroundColor = bnt_Login.getCssValue("background-color");
        String fontSize = bnt_Login.getCssValue("font-size");
        String fontWeight = bnt_Login.getCssValue("font-weight");

        System.out.println("Background Color: " + backgroundColor);
        System.out.println("Font Size: " + fontSize);
        System.out.println("Font Weight: " + fontWeight);

        //getSize of Login button
        Dimension dimension = bnt_Login.getSize();
        System.out.println("High: " + dimension.getHeight());
        System.out.println("Weight: " + dimension.getWidth());

        //getLocation of Login button
        Point location = bnt_Login.getLocation();
        System.out.println("X: " + location.getX());
        System.out.println("Y: " + location.getY());

        //getAttribute()
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        driver.findElement(By.xpath("//input[@class='form-control input-sm']")).sendKeys("FPT Telecom");

        driver.findElement(By.xpath("//a[normalize-space()='FPT Telecom']")).click();
        String companyName = driver.findElement(By.xpath("//input[@id = 'company']")).getAttribute("value");
        System.out.println(companyName);

        String vatNumber = driver.findElement(By.xpath("//input[@id = 'vat']")).getAttribute("value");
        System.out.println(vatNumber);
        driver.quit();
    }
}
