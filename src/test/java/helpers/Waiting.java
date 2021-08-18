package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting extends BasePage{

    public Waiting(WebDriver driver) {
        super(driver);
    }

    public void timeout(WebElement element){
        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOf(element));
    }
}
