package PageObjectTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RozetkaTest {
    WebDriver driver;
    MainPage mainPage;
    SearchResultPage searchResultPage;
    Registration registration;

    @Before
    public void precondition() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        registration = new Registration(driver);

    }

    @Test
    public void searchRozetka() throws InterruptedException {

        mainPage.open();
        mainPage.searchForProject("xiaomi mi max");

        Assert.assertEquals("xiaomi mi max", searchResultPage.getSearchMessage());

        driver.quit();



    }

    public void registrationRozetka() throws InterruptedException{
         mainPage.open();
        int random = (int) (Math.random() * 1000);
        registration.registration("Вася Пупкин", "troololol" + random  + "@temp.com", "qwertyqwerty" );
        String result = mainPage.getNameField();
        Assert.assertEquals("result = ", "Вася Пупкин" , result);


        driver.quit();
    }

    /*@Test
    public void test() {
        while (true) {
            try {
                registrationRozetka();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
*/
    @After
    public void postcondition() {
        driver.close();
    }
}
