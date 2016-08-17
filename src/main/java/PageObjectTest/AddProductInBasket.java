package PageObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by VitaliyS on 08/17/2016.
 */
public class AddProductInBasket {
    private WebDriver driver;


    public AddProductInBasket(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAndAddProduct(String button) {
        driver.findElement(By.xpath(".//div[@id='cart-popup']//a[contains(text(), 'Meizu M3 Note 16GB Grey')]")).click();
        driver.findElement(By.cssSelector(".popup-close-icon.sprite")).click();
        driver.findElement(By.xpath(".//div[@id='cart-popup']//a[contains(text(), 'Meizu M3 Note 16GB Silver')]")).click();
        driver.findElement(By.cssSelector(".popup-close-icon.sprite")).click();
        driver.findElement(By.xpath(".//div[@id='cart-popup']//a[contains(text(), 'Meizu M3 2/16GB White')]")).click();
        driver.findElement(By.cssSelector(".popup-close-icon.sprite")).click();
        driver.findElement(By.cssSelector("hub-i-count")).click();


    }
}
