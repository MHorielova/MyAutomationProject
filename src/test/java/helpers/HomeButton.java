package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeButton extends BasePage {

    @FindBy(xpath = "//div[1]/button[1]")
    public WebElement homeButton;

    public HomeButton(WebDriver driver) {
        super(driver);
    }
}
