package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeLoginPage {

    WebDriver driver;

    public static String xpathLoginButton = "//*[@id='navbar-top']/div/ul[2]/li[2]/button",
                         inputLogin = "userLoginName",
                         inputPass = "userLoginPass",
                         xpathLoginButtonAuth = "//*[@class='form-group']/button";

    public BeforeLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public BeforeLoginPage clickOnLogin() {
        driver.findElement(By.xpath(xpathLoginButton)).click();
        return this;
    }

    public BeforeLoginPage enterLoginAndPassword(String userLogin, String userPass) {
        driver.findElement(By.name(inputLogin)).sendKeys(userLogin);
        driver.findElement(By.name(inputPass)).sendKeys(userPass);
        return this;
    }

    public BeforeLoginPage clickOnButtonForAuth() {
        driver.findElement(By.xpath(xpathLoginButtonAuth)).click();
        return this;
    }


}
