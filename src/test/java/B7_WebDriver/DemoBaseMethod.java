package B7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoBaseMethod {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Navigate to a page
        driver.navigate().to("https://anhtester.com/");

        driver.findElement(By.xpath("//a[@id='btn-login']")).click();

        //Điều hướng về lịch sử trang trước đó
        driver.navigate().back();

        //Làm mới trang hiện tại
        driver.navigate().refresh();

        //Điều hướng đến trang tiếp sau
        driver.navigate().forward();

        //Get the title ò the page
        String title = driver.getTitle();

        //Get the curent URL
        String url = driver.getCurrentUrl();

        //Get the current page HTML source
        String html = driver.getPageSource();

        System.out.println(title);
        System.out.println(url);
        System.out.println(html);

        System.out.println(html.contains("Kiến thức Tester"));



        driver.quit();

    }
}
