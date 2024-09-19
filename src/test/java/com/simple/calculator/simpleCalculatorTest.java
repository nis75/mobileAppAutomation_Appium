package com.simple.calculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class simpleCalculatorTest extends BaseTest {



    @Test
    public void addShouldSucceed() {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_2")).click();

        driver.findElement(By.id("plus")).click();

        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("btn_3")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(), "25");
        takeScreenShot();

    }

    @Test
    public void subTracShouldSucceed() {
        driver.findElement(By.id("btn_9")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("minus")).click();

        driver.findElement(By.id("btn_4")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(), "50");
        takeScreenShot();
    }

    @Test
    public void multiTracShouldSucceed() {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("multi")).click();

        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(), "100");
        takeScreenShot();
    }

    @Test
    public void diviTracShouldSucceed() {
        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_1")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("divi")).click();

        driver.findElement(By.id("btn_1")).click();
        driver.findElement(By.id("_0p_1")).click();

        driver.findElement(By.id("equal")).click();
        Assert.assertEquals(driver.findElement(By.id("formula")).getText().trim(), "10");
        takeScreenShot();
    }

}
