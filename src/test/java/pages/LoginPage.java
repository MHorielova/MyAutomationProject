package pages;

import helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[text()='Customer Login']")
    public WebElement customerLoginButton;
    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    public WebElement bankManagerLoginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

}
