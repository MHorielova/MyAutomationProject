package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import pages.LoginPage;

import java.util.StringJoiner;

import static java.io.File.separator;

public class TestConfig {

    protected WebDriver driver;

    public TestConfig() {
        StringJoiner pathToChromeDriver = new StringJoiner(separator);
        String path = pathToChromeDriver.add("src").add("test").add("resources").add("chromedriver").toString();
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().window().maximize();
        HomeButton homeButton = new HomeButton(driver);
        new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(homeButton.homeButton));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
