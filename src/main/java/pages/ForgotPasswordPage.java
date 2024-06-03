package pages;

import io.qameta.allure.Step;
import lombok.Data;
import org.openqa.selenium.*;

@Data
public class ForgotPasswordPage {
    private final WebDriver driver;
    private final By loginButton = By.xpath(".//a[text() = 'Войти']");

    @Step("Click login button")
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}