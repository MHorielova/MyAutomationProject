package tests;

import helpers.LogoutButton;
import helpers.TestConfig;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.CustomerPage;
import pages.LoginPage;

public class ExistedCustomerLogin extends TestConfig {

    private final LoginPage loginPage = new LoginPage(driver);
    private final CustomerPage customerPage = new CustomerPage(driver);
    private final LogoutButton logoutButton = new LogoutButton(driver);
    private final AccountPage accountPage = new AccountPage(driver);

    @Test
    public void customerLogin() {
    loginPage.customerLoginButton.click();
    new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(customerPage.userSelect));
    customerPage.userSelect.click();
    customerPage.userRon.click();
    customerPage.loginButton.click();
    logoutButton.logoutButton.isDisplayed();
    accountPage.depositButton.isDisplayed();
    accountPage.withdrawlButton.isDisplayed();
    accountPage.transactionsButton.isDisplayed();
    logoutButton.logoutButton.click();
    customerPage.yourNameText.isDisplayed();
    }
}
