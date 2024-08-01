package B8_DropdownRadioCheckbox;

import common.BaseTest;
import org.openqa.selenium.By;

public class HanderRadioButton extends BaseTest {
    public static void main(String[] args) {

        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        System.out.println("Radio Button Male: " + driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected());

        sleep(1);

        driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).click();
        System.out.println("Radio Button 1 after click: " + driver.findElement(By.xpath("//label[normalize-space()='Male']//input[@name='optradio']")).isSelected());

        System.out.println("Radio Button Female: " + driver.findElement(By.xpath("//label[normalize-space()='Female']//input[@name='optradio']")).isSelected());


        closeDriver();
    }
}
