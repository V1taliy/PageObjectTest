package PageObjectTest;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Vitaliy on 8/15/2016.
 */
public class SearchResultPage {
    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;

    }

    public String getSearchMessage() {
        return driver.findElement(By.cssSelector(".search-result-title-text")).getText();
    }

    public String getProductInBasket(String locator) {

        return driver.findElement(By.xpath(locator)).getText();


   /* public WebElement setSearchElement(String type, By by) {
        WebElement element = null;
        switch (type) {
            case "xpath":
                element = driver.findElement(by);
                break;
            case "id":
                element = driver.findElement(by);
                break;
            case "cssSelector":
                element = driver.findElement(by);
                break;
            case "name":
                element = driver.findElement(by);
                break;
            case "className":
                element = driver.findElement(by);
                break;
            default:
                System.err.println("invalid parameter");
                break;
        }
        return element;
    }*/
    }
}