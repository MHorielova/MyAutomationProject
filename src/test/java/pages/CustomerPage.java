package pages;

import helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends BasePage {

    @FindBy(id = "userSelect")
    public WebElement userSelect;
    @FindBy(xpath= "//button[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//option[@class='ng-binding ng-scope' and @value=3]")
    public WebElement userRon;
    @FindBy(xpath = "//label[text()='Your Name :']")
    public WebElement yourNameText;

    public CustomerPage(WebDriver driver) {
        super(driver);
    }
}
