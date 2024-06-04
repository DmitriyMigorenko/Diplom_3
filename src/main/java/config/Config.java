package config;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Config {
    public static final String BASE_URI = "https://stellarburgers.nomoreparties.site";
    public static final String API_AUTH = "/api/auth";
    public static final String REGISTER_PAGE = "https://stellarburgers.nomoreparties.site/register";
    public static final String FORGOT_PASSWORD_PAGE = "https://stellarburgers.nomoreparties.site/forgot-password";
    public static final int DEFAULT_TIMEOUT = 10;

    public static void waitOfVisibleElement(WebDriver driver, By element) {
        new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}