package PageObjectTest;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RozetkaTest {
    static WebDriver driver;
    MainPage mainPage;
    SearchResultPage searchResultPage;
    Registration registration;
    AddProductInBasket addProductInBasket;

    @BeforeClass
    public static void foo() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @Before
    public void precondition() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        registration = new Registration(driver);
        addProductInBasket = new AddProductInBasket(driver);
    }

    @Test
    public void searchRozetka() throws InterruptedException {
        mainPage.open();
        mainPage.searchForProject("meizu m3 note 16gb");
        Assert.assertEquals("meizu m3 note 16gb", searchResultPage.getSearchMessage());
        Thread.sleep(5000);
    }

    @Test
    public void findProductInBasket() {

        String product1 = searchResultPage.getProductInBasket(".//div[@id='cart-popup']//a[contains(text(), 'Meizu M3 Note 16GB Grey')]");
        String product2 = searchResultPage.getProductInBasket(".//div[@id='cart-popup']//a[contains(text(), 'Meizu M3 Note 16GB Silver')]");
        String product3 = searchResultPage.getProductInBasket(".//div[@id='cart-popup']//a[contains(text(), 'Meizu M3 2/16GB White')]");

        Assert.assertEquals("Meizu M3 Note 16GB Grey", product1);
        Assert.assertEquals("Meizu M3 Note 16GB Silver", product2);
        Assert.assertEquals("Meizu M3 2/16GB White", product3);

    }

    @Ignore
    @Test
    public void registrationRozetka() throws InterruptedException {
        mainPage.open();
        int random = (int) (Math.random() * 1000);
        registration.registration("Вася Пупкин", "troololol" + random + "@temp.com", "qwertyqwerty");
        String result = mainPage.getNameField();
        Assert.assertEquals("result = ", "Вася Пупкин", result);


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
    @AfterClass
    public static void postcondition() {
        driver.quit();
    }
}
