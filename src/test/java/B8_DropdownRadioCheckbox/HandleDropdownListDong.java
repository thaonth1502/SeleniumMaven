package B8_DropdownRadioCheckbox;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HandleDropdownListDong extends BaseTest {
    public static void main(String[] args) {

        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(2);

        driver.findElement(By.xpath("//span[normalize-space()='Select a Country']/parent::a")).click();
        sleep(2);
        //li[normalize-space()='Thailand']
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Country']/parent::a)//following-sibling::div//input")).sendKeys("Vietnam");
        sleep(2);
        driver.findElement(By.xpath("//li[normalize-space()='Vietnam']")).click();

//        driver.findElement(By.xpath("(//span[normalize-space()='Select a Country']/parent::a)//following-sibling::div//input")).sendKeys(Keys.ENTER);
        sleep(1);
        closeDriver();

    }
}
