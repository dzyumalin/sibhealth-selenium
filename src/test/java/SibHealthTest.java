import config.Web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BeforeLoginPage;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class SibHealthTest{

    @Test
    void loginTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Web.config.baseUrl());
        BeforeLoginPage beforeLoginPage = new BeforeLoginPage(driver);

        String notificationMessage = beforeLoginPage
                .clickOnLogin()
                .enterLoginAndPassword(Web.config.registerNumber(), Web.config.password())
                .clickOnButtonForAuth();
        assertEquals("Вы успешно авторизованы", notificationMessage);
        driver.quit();
    }

}
