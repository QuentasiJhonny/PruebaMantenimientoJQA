/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.service;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import static org.testng.Assert.*;
import com.example.model.OperationModel;
import org.junit.Assert;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.id;
import org.openqa.selenium.WebDriver;
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
public class CalculateSimpleNGTest {
    
    private WebDriver driver;
    public CalculateSimpleNGTest() {
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
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:8080/calculadora");
        segundosPausa(2);   
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
     driver = new ChromeDriver();
        driver.quit();
    }

    @Test
    public void testAdd() {
        driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("add")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testSubtract() {
       driver.findElement(By.id("a")).sendKeys("a");
        driver.findElement(By.id("b")).sendKeys("b");
        driver.findElement(By.name("sustrac")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testMultiply() {
        driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("multiply")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testDivide() {
        driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("divide")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testFactorial() {
       driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("factorial")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testFibonacci() {
        driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("fibonaci")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testSqrt() {
        driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("sqrt")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testPower() {
       driver.findElement(By.name("a")).sendKeys("a");
        driver.findElement(By.name("b")).sendKeys("b");
        driver.findElement(By.name("power")).click();
        segundosPausa(5);
        Assert.assertTrue(driver.findElement(By.xpath("")));
    }

    @Test
    public void testClearSimple() {
        System.out.println("clearSimple");
        OperationModel model = null;
        CalculateSimple instance = new CalculateSimple();
        OperationModel expResult = null;
        OperationModel result = instance.clearSimple(model);
        assertEquals(result, expResult);
        fail("The test case is a prototype.");
    }

    @Test
    public void testClearAdvanced() {
        System.out.println("clearAdvanced");
        OperationModel model = null;
        CalculateSimple instance = new CalculateSimple();
        OperationModel expResult = null;
        OperationModel result = instance.clearAdvanced(model);
        assertEquals(result, expResult);
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
