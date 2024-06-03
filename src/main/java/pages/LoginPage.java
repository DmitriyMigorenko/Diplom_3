package pages;

import io.qameta.allure.Step;
import lombok.Data;
import org.openqa.selenium.*;

import static config.Config.*;

@Data
public class LoginPage {
    private final WebDriver driver;
    private final By email = By.xpath(".//label[text() = 'Email']/parent::div//input");
    private final By password = By.xpath(".//label[text() = 'Пароль']/parent::div//input");
    private final By enterButton = By.xpath(".//button[text() = 'Войти']");
    private final By entrance = By.xpath(".//h2[text() = 'Вход']");
    private final By register = By.xpath(".//a[text() = 'Зарегистрироваться']");
    private final By recoveryPass = By.xpath(".//a[text() = 'Восстановить пароль']");

    @Step("Input user email")
    public void setEmail(String userEmail) {
        driver.findElement(email).sendKeys(userEmail);
    }

    @Step("Input user password")
    public void setPassword(String userPassword) {
        driver.findElement(password).sendKeys(userPassword);
    }

    @Step("Click login button")
    public void clickLoginButton() {
        driver.findElement(enterButton).click();
    }

    @Step("Login user")
    public void loginUser(String userEmail, String userPassword) {
        setEmail(userEmail);
        setPassword(userPassword);
        clickLoginButton();
    }

    @Step("Click register")
    public void clickRegister() {
        driver.findElement(register).click();
    }

    @Step("Click recovery pass")
    public void clickRecoveryPass() {
        driver.findElement(recoveryPass).click();
    }

    @Step("Wait for display entrance")
    public void waitEntranceDisplayed() {
        waitOfVisibleElement(driver, entrance);
    }

    @Step("Get text of entrance")
    public String getEntranceText() {
        return driver.findElement(entrance).getText();
    }
}