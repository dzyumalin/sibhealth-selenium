package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BeforeLoginPage {

    WebDriver driver;

    public static String xpathLoginButton = "//*[@id='navbar-top']/div/ul[2]/li[2]/button",
                         inputLogin = "//*[@id=\"modal\"]/div/div[2]/div/div/form/div[1]/label/input",
                         inputPass = "//*[@id=\"modal\"]/div/div[2]/div/div/form/div[2]/label/input",
                         notificationMsg = "html/body/div[7]/div[2]/p",
                         xpathLoginButtonAuth = "//*[@class='form-group']/button";

    public BeforeLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public BeforeLoginPage clickOnLogin() {
        driver.findElement(By.xpath(xpathLoginButton)).click();
        return this;
    }

    public BeforeLoginPage enterLoginAndPassword(String userLogin, String userPass) {
        driver.findElement(By.xpath(inputLogin)).sendKeys(userLogin);
        driver.findElement(By.xpath(inputPass)).sendKeys(userPass);
        return this;
    }

    public BeforeLoginPage clickOnButtonForAuth() {
        driver.findElement(By.xpath(xpathLoginButtonAuth)).click();
        driver.findElement(By.xpath(notificationMsg));
        return this;
    }


}
