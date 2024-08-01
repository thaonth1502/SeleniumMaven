package B7_WebDriver;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoCookie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        
        //Navigate to a page
        driver.navigate().to("https://crm.anhtester.com/admin/");

        Cookie cookie = new Cookie("sp_session", "0afe7815e7c3efe8459024f59c4e58990335fc2a");
        driver.manage().addCookie(cookie);
        Thread.sleep(1000);
        driver.navigate().refresh();
        System.out.println(driver.manage().getCookieNamed("sp_session").getValue());
        Thread.sleep(3000);

        driver.quit();
    }

}
