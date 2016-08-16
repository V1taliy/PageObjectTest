package PageObjectTest;


import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import javafx.beans.property.SetProperty;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RozetkaTest {
    WebDriver driver;
    MainPage mainPage;
    SearchResultPage searchResultPage;

    @Before
    public void precondition() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    public void searchRozetka() throws InterruptedException {

        mainPage.open();
        mainPage.searchForProject("xiaomi mi max");

        Assert.assertEquals("xiaomi mi max", searchResultPage.getSearchMessage());

        driver.quit();


    }

    @After
    public void postcondition() {
        driver.quit();
    }
}
