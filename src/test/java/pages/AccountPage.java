package pages;

import helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.List;


public class AccountPage extends BasePage {

    @FindBy(xpath = "//div[3]/button[1]")
    public WebElement transactionsButton;
    @FindBy(xpath = "//div[3]/button[2]")
    public WebElement depositButton;
    @FindBy(xpath = "//div[3]/button[3]")
    public WebElement withdrawlButton;
    @FindAll({@FindBy(xpath = "//*//strong[@class='ng-binding']")})
    public List<WebElement> accountValues;
    @FindBy(xpath = "//*//input")
    public WebElement inputField;
    @FindBy(xpath = "//div/form/button")
    public WebElement submitButton;
    protected final String value1 = "100";

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void getBalanceValueCheck() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountValues.get(1).getText(), "0", "firstbalans is NOT = 0");
    }

    public void setInputFieldCheck() {
        inputField.click();
        inputField.sendKeys(value1);
        submitButton.click();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountValues.get(1).getText(), value1, "Balance doesn't change");
    }
}
