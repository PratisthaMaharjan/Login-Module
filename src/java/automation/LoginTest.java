/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {
    
    // Making a function to execute multiple test case
    public static void login(WebDriver driver, String user, String pass, String testname){

        driver.get("http://localhost:8080/Servlet/login.jsp");

        // Locate Elements
        WebElement username = driver.findElement(By.name("username"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginBtn = driver.findElement(By.id("loginBtn"));

        // Test Case Execution
        username.sendKeys(user);
        password.sendKeys(pass);
        loginBtn.click();
        
        // Showing output in NetBeans console
        if (driver.getCurrentUrl().contains("index")) {
            System.out.println("Login Successful - PASS");
        } else {
            System.out.println("Login Failed - FAIL");
        }
        
        // Adding sleep to view result properly
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }        
    }

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        
        login(driver, "admin", "admin123", "Valid Login");
        login(driver, "wrong", "wrong", "Inalid Login");
        login(driver, "", "", "Empty Field");

        driver.quit();
    }
}