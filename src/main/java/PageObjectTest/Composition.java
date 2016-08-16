package PageObjectTest;

import org.openqa.selenium.WebDriver;

/**
 * Created by VitaliyS on 08/16/2016.
 */
public class Composition {

    public MainPage mainPage;
    public SearchResultPage searchResultPage;
    public Registration registration;

    public Composition(WebDriver driver){
        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        registration = new Registration(driver);
    }

}
