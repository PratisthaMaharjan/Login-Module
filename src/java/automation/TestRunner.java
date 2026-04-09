/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automation;

import org.testng.TestNG;

// Run this file to execute LoginTestNG class

public class TestRunner {
    public static void main(String[] args) {
        
        // Creating TestNG instance
        TestNG testng = new TestNG();

        // Specifying what class to run by TestNG 
        testng.setTestClasses(new Class[] { LoginTestNG.class });

        // Run the tests
        testng.run();
    }
}
