package tests;

import helpers.HeadersButtons;
import helpers.TestConfig;
import helpers.Waiting;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AccountPage;
import pages.BankingTransactionHistoryPage;
import pages.CustomerPage;
import pages.SelectRole;

public class DepositAndTransactionsCheck  extends TestConfig {

    private final SelectRole selectRole = new SelectRole(driver);
    private final CustomerPage customerPage = new CustomerPage(driver);
    private final HeadersButtons headersButtons = new HeadersButtons(driver);
    private final AccountPage accountPage = new AccountPage(driver);
    private final BankingTransactionHistoryPage bankingTransactionHistoryPage = new BankingTransactionHistoryPage(driver);
    private final Waiting waiting = new Waiting(driver);

    @Test
    public void depositAndTransactionsCheck() {
        selectRole.customerLoginButton.click();
        waiting.timeout(customerPage.userSelect);
        customerPage.userSelect.click();
        customerPage.userRon.click();
        customerPage.loginButton.click();
        waiting.timeout(headersButtons.logoutButton);
        waiting.timeout(accountPage.depositButton);
        accountPage.depositButton.click();
        waiting.timeout(accountPage.inputField);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(accountPage.accountValues.get(1).getText(), "0", "firstbalans is NOT = 0");
        accountPage.inputField.click();
        accountPage.inputField.sendKeys(accountPage.firstDeposit);
        accountPage.submitButton.click();
        softAssert.assertEquals(accountPage.accountValues.get(1).getText(), accountPage.firstDeposit, "Balance doesn't change");
        driver.navigate().refresh();
        waiting.timeout(accountPage.transactionsButton);
        accountPage.transactionsButton.click();
        waiting.timeout(bankingTransactionHistoryPage.backButton);
        softAssert.assertEquals(bankingTransactionHistoryPage.transactionsList.get(1).getText(), "100", "Deposit is NOT working");
        headersButtons.logoutButton.click();
        waiting.timeout(customerPage.yourNameText);
        softAssert.assertAll();
    }
}
