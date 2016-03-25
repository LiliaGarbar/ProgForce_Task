package ProgForceTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstStep {
    private WebDriver driver;
    private final By emailField = By.cssSelector(".req#email");
    private final By passwordField = By.cssSelector("#password1");
    private final By continueButton = By.xpath(".//*[@class='regForm-continue btn btn-primary']");

    public FirstStep enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;

    }

    public FirstStep enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;

    }

    public FirstStep clickContinue() {
        driver.findElement(continueButton).click();
        return this;

    }

    public FirstStep openFirstPage() {
        driver.get("https://www.mypoints.com/emp/u/signup.do");
        return this;


    }

    public FirstStep(WebDriver driver) {
        this.driver = driver;
    }
}






