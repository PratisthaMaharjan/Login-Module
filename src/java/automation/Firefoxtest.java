/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxtest {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\selenium\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://localhost:8080/Servlet/login.jsp");

        System.out.println(driver.getTitle());

        driver.quit();
    }
}
