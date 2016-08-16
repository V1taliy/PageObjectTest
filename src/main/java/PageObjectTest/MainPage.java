package PageObjectTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Vitaliy on 8/15/2016.
 */
public class MainPage {
   private WebDriver driver;

    public MainPage(WebDriver driver){

        this.driver = driver;
    }
    public void open(){

        driver.get("http://rozetka.com.ua");
    }
    public void searchForProject(String product){
        driver.findElement(By.cssSelector("[name=header-search-input-text-wrap]>input")).sendKeys(product);
        driver.findElement(By.name("search-button")).click();
    }

    public String getNameField() {
        return driver.findElement(By.xpath(".//*[@id='personal_information']/div/div/div[3]/div/div/div[1]/div[2]")).getText();
    }

}
