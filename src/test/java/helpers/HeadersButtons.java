package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeadersButtons extends BasePage{

    @FindBy(xpath = "//button[@ng-click='byebye()']")
    public WebElement logoutButton;
    @FindBy(xpath = "//button[@ng-click='home()']")
    public WebElement homeButton;

    public HeadersButtons(WebDriver driver) {
        super(driver);
    }
}
