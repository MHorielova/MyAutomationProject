package pages;

import helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectRole extends BasePage {

    @FindBy(xpath = "//button[@ng-click='customer()']")
    public WebElement customerLoginButton;

    public SelectRole(WebDriver driver) {
        super(driver);
    }
}
