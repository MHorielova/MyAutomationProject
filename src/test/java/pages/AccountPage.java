package pages;

import helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountPage extends BasePage {

    @FindBy(xpath = "//button[@ng-click='transactions()']")
    public WebElement transactionsButton;
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    public WebElement depositButton;
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    public WebElement withdrawlButton;
    @FindAll({@FindBy(xpath = "//*//strong[@class='ng-binding']")})
    public List<WebElement> accountValues;
    @FindBy(xpath = "//*//input[@ng-model='amount']")
    public WebElement inputField;
    @FindBy(xpath = "//button[@class='btn btn-default']")
    public WebElement submitButton;
    public String firstDeposit = "100";

    public AccountPage(WebDriver driver) {
        super(driver);
    }
}
