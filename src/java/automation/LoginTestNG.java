package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTestNG {
    
    WebDriver driver;
    // Opens Firefox
    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
    }
    
    // Makes sure to close browser once test finishes
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public void loginTest(WebDriver driver, String user, String pass, boolean expectSuccess) throws InterruptedException {
        driver.get("http://localhost:8080/Servlet/login.jsp");

        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.id("loginBtn"));

        username.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();

        Thread.sleep(4000);

        if(expectSuccess) {
            Assert.assertTrue(driver.getCurrentUrl().contains("index"));
        } else {
            Assert.assertTrue(driver.getCurrentUrl().contains("login"));
        }
    }

    @Test(priority=1)
    public void validLogin() throws InterruptedException {
        loginTest(driver, "admin", "admin123", true);
        driver.quit();
    }

    @Test(priority=2)
    public void invalidLogin() throws InterruptedException {
        loginTest(driver, "wrong", "wrong", true);
        driver.quit();
    }

    @Test(priority=3)
    public void emptyLogin() throws InterruptedException {
        loginTest(driver, "", "", false);
        driver.quit();
    }
    
}