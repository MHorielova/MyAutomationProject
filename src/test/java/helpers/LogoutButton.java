package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutButton extends BasePage{

    @FindBy(xpath = "//div[1]/button[2]")
    public WebElement logoutButton;

    public LogoutButton(WebDriver driver) {
        super(driver);
    }
}
