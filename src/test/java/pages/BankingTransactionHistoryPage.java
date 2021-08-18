package pages;

import helpers.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BankingTransactionHistoryPage extends BasePage {

    @FindBy(xpath = "//button[@ng-click='back()']")
    public WebElement backButton;
    @FindAll({@FindBy(xpath = "//*//td[@class='ng-binding']")})
    public List<WebElement> transactionsList;

    public BankingTransactionHistoryPage(WebDriver driver) {
        super(driver);
    }
}
