package com.simple.calculator;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {
    AndroidDriver driver;

    @BeforeClass
    public void setupAppium() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            capabilities.setCapability("appium:udid", "R58NA54D9TK");
            capabilities.setCapability("appium:platformVersion", "13");
            capabilities.setCapability("appium:appPackage", "com.bng.calculator");
            capabilities.setCapability("appium:appActivity", "com.bng.calc.MainActivity");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appium:automationName", "UiAutomator2");

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    public void takeScreenShot(){
        try {
        File scrFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir")+"/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir + System.currentTimeMillis()+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
