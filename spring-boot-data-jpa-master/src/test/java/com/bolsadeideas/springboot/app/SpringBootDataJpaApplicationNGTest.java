/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolsadeideas.springboot.app;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Jhonny
 */
public class SpringBootDataJpaApplicationNGTest {
    
    public SpringBootDataJpaApplicationNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:5050/listar");
        segundosPausa(2);   
        
        
    }
    
    @AfterMethod
    public void tearDownMethod() throws Exception {
        ChromeDriver driver = new ChromeDriver();
        driver.quit();
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SpringBootDataJpaApplication.main(args);
        fail("The test case is a prototype.");
    }
    @Test
    public static void segundosPausa(long sleeptime){
    try{
        Thread.sleep(sleeptime*1000);
        }
    catch(InterruptedException ex){
            
        }
    }
    
}
