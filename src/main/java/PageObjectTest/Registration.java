package PageObjectTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registration {
    private WebDriver driver;
    public Composition composition;

    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    public void registration(String userName, String email, String pass) {
        //composition = new Composition(driver);


        driver.findElement(By.name("signin")).click();

        driver.findElement(By.xpath(".//form[@id='popup_signin']//a[contains(@class, 'auth-f-signup-link')]")).click();

        driver.findElement(By.xpath(".//*[@id='signup_form']/div[1]/input")).sendKeys(userName);
        driver.findElement(By.xpath(".//*[@id='signup_form']/div[2]/input")).sendKeys(email);

        driver.findElement(By.xpath(".//*[@id='signup_form']/div[3]/input")).sendKeys(pass);
        driver.findElement(By.xpath(".//*[@id='signup_form']/div[5]/span/button")).click();

    }

}
