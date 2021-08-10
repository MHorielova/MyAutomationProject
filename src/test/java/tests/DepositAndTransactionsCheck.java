package tests;

import helpers.LogoutButton;
import helpers.TestConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.BankingTransactionHistoryPage;
import pages.CustomerPage;
import pages.LoginPage;

public class DepositAndTransactionsCheck  extends TestConfig {

    private final LoginPage loginPage = new LoginPage(driver);
    private final CustomerPage customerPage = new CustomerPage(driver);
    private final LogoutButton logoutButton = new LogoutButton(driver);
    private final AccountPage accountPage = new AccountPage(driver);
    private final BankingTransactionHistoryPage bankingTransactionHistoryPage = new BankingTransactionHistoryPage(driver);

    @Test
    public void depositAndTransactionsCheck() {
        loginPage.customerLoginButton.click();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(customerPage.userSelect));
        customerPage.userSelect.click();
        customerPage.userRon.click();
        customerPage.loginButton.click();
        logoutButton.logoutButton.isDisplayed();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(accountPage.depositButton));
        accountPage.depositButton.click();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(accountPage.inputField));
        accountPage.getBalanceValueCheck();
        accountPage.setInputFieldCheck();
        accountPage.transactionsButton.click();
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(bankingTransactionHistoryPage.backButton));
        bankingTransactionHistoryPage.checkDepositInTransactionList();
        logoutButton.logoutButton.click();
        customerPage.yourNameText.isDisplayed();
    }
}
