package B8_DropdownRadioCheckbox;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleCheckbox extends BaseTest {


    public static void main(String[] args) {

       createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        System.out.println("Check box 1: " + driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input")).isSelected());
        System.out.println("Check box 2: " +driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected());
        sleep(1);
        driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
        System.out.println("Check box 1 AFTER: " + driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected());

        //Multi checkbox
        List<WebElement> listCheckbox = driver.findElements(By.xpath("//div[normalize-space()='Multiple Checkbox Demo']/following-sibling::div//div[@class = 'checkbox']//input"));

        for (int i = 0; i < listCheckbox.size() ; i++) {
            System.out.println(listCheckbox.get(i).isSelected());
        }

       closeDriver();

    }
}
