package tests;

import helpers.HeadersButtons;
import helpers.TestConfig;
import helpers.Waiting;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CustomerPage;
import pages.SelectRole;

public class ExistedCustomerLogin extends TestConfig {

    private final SelectRole selectRole = new SelectRole(driver);
    private final CustomerPage customerPage = new CustomerPage(driver);
    private final HeadersButtons headersButtons = new HeadersButtons(driver);
    private final AccountPage accountPage = new AccountPage(driver);
    private final Waiting waiting = new Waiting(driver);

    @Test
    public void customerLogin() {
    selectRole.customerLoginButton.click();
    waiting.timeout(customerPage.userSelect);
    customerPage.userSelect.click();
    customerPage.userRon.click();
    customerPage.loginButton.click();
    waiting.timeout(headersButtons.logoutButton);
    waiting.timeout(accountPage.depositButton);
    waiting.timeout(accountPage.withdrawlButton);
    waiting.timeout(accountPage.transactionsButton);
    headersButtons.logoutButton.click();
    customerPage.yourNameText.isDisplayed();
    }
}
