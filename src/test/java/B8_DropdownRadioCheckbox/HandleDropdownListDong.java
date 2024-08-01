package B8_DropdownRadioCheckbox;

import common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandleDropdownListDong extends BaseTest {
    public static void main(String[] args) {


        createDriver();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Actions action = new Actions(driver);

        List<WebElement> selectCountryElements = driver.findElements(By.xpath("//div[@class='main-search-input-item user-chosen-select-container']"));
//        System.out.println("============selectCountryElement=============" + selectCountryElements);
        List<WebElement> element = driver.findElements(By.xpath("//input[@placeholder='What are you looking for?']"));
        element.get(1).sendKeys("a");
        sleep(10);

        selectCountryElements.get(0).click();
//        if (selectCountryElements.size() > 0) {
//            JavascriptExecutor executor = (JavascriptExecutor)driver;
//            executor.executeScript("arguments[0].click();", selectCountryElements.get(0));
//        }
        sleep(10);

//        driver.findElement(By.xpath("(//span[normalize-space()='Select a Country']//parent::a)//following-sibling::div//input")).sendKeys("Vietnam");
//        sleep(2);
//
////        driver.findElement(By.xpath("//span[normalize-space()='Vietnam']")).click();
//        driver.findElement(By.xpath("(//span[normalize-space()='Select a Country']//parent::a)//following-sibling::div//input")).sendKeys(Keys.ENTER);
//        sleep(2);

        closeDriver();

    }
}
