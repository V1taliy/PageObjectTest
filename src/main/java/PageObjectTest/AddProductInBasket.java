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

    public void clickAndAddProduct() {
        driver.findElement(By.xpath(".//*[@id='block_with_search']/div/div[1]/div[2]/div[4]/div/div/form/span/button")).click();
        driver.findElement(By.cssSelector(".popup-close-icon.sprite")).click();
        driver.findElement(By.xpath(".//*[@id='block_with_search']/div/div[2]/div[2]/div[4]/div/div/form/span/button")).click();
        driver.findElement(By.cssSelector(".popup-close-icon.sprite")).click();
        driver.findElement(By.xpath(".//*[@id='block_with_search']/div/div[3]/div[2]/div[4]/div/div/form/span/button")).click();
        driver.findElement(By.cssSelector(".popup-close-icon.sprite")).click();
        driver.findElement(By.cssSelector("hub-i-count")).click();
    }

    /**
     * @info only xpath selector
     * */
    public void clickAndAddProduct(String locator, String locatorType) {
        if (locatorType.equals("xpath")) {
            driver.findElement(By.xpath(locator)).click();
        } else if (locatorType.equals("cssSelector")) {
            driver.findElement(By.cssSelector(locator)).click();
        }

    }

}
