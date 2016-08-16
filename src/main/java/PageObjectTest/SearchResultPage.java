package PageObjectTest;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Vitaliy on 8/15/2016.
 */
public class SearchResultPage {
private WebDriver driver;
    public SearchResultPage(WebDriver driver){
        this.driver = driver;

}
    public String getSearchMessage(){
        return driver.findElement(By.cssSelector(".search-result-title-text")).getText();
    }
}
