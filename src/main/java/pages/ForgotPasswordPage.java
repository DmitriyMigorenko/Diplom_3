package pages;

import config.Config;
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

    @Step("Open forgot password page")
    public void openForgotPasswordPage(){
        driver.get(Config.FORGOT_PASSWORD_PAGE);
    }
}