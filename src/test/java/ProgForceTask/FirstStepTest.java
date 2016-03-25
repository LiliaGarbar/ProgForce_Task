package ProgForceTask;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;

public class FirstStepTest {

    private FirefoxDriver driver;
    private FirstStep firstStep;

    @Before
    public void precondition(){
        driver = new FirefoxDriver();
        firstStep = new FirstStep(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    @Test
    public void loginTest() {
        firstStep.openFirstPage()
                .enterEmail("lilia@gmail.com")
                .enterPassword("lili3025")
                .clickContinue();

        Assert.assertTrue(driver.findElement(By.xpath(".//*[@class='regForm-step-2']/h2")).isDisplayed());
    }

    @After
    public void finish(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }



}
