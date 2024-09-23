package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SampleTestcase {

    public static WebDriver driver = null;

    @BeforeMethod
    public void launchDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver. manage().window().fullscreen();
    }

    @Test
    public void test(){
        driver.get("https://www.google.com/");
        System.out.println("Google launched");
    }

    @Test
    public void test2(){
        driver.get("https://www.google.com/");
        System.out.println("Google launched again");
    }

    @AfterMethod
    public void exit(){
        driver.quit();
    }


}
