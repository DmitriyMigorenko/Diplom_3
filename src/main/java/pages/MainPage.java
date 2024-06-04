package pages;

import io.qameta.allure.Step;
import lombok.Data;
import org.openqa.selenium.*;

import static config.Config.*;

@Data
public class MainPage {
    private final WebDriver driver;
    private final By loginAccountButton = By.xpath(".//button[text() = 'Войти в аккаунт']");
    private final By accountProfileButton = By.xpath(".//p[text() = 'Личный Кабинет']");
    private final By createOrderButton = By.xpath(".//button[text() = 'Оформить заказ']");
    private final By bunTab = By.xpath(".//span[text() = 'Булки']/parent::div");
    private final By sauceTab = By.xpath(".//span[text() = 'Соусы']/parent::div");
    private final By fillingTab = By.xpath(".//span[text() = 'Начинки']/parent::div");
    private final By activeTab = By.xpath(".//div[contains(@class, 'tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect')]");
    private final By mainTextConstructor = By.xpath(".//*[text() = 'Соберите бургер']");

    @Step("Login via loginAccountButton")
    public void clickLoginAccountButton() {
        driver.findElement(loginAccountButton).click();
    }

    @Step("Login via accountProfileButton")
    public void clickAccountProfileButton() {
        driver.findElement(accountProfileButton).click();
    }

    @Step("Get create order button text")
    public String getCreateOrderButtonText() {
        return driver.findElement(createOrderButton).getText();
    }

    @Step("Pick bun")
    public void clickBunTab() {
        driver.findElement(bunTab).click();
    }

    @Step("Pick sauce")
    public void clickSauceTab() {
        driver.findElement(sauceTab).click();
    }

    @Step("Pick filling")
    public void clickFillingTab() {
        driver.findElement(fillingTab).click();
    }

    @Step("Get active tab text")
    public void getActiveTabText() {
        driver.findElement(activeTab).getText();
    }

    @Step("Get main text")
    public String getMainTextConstructor() {
        return driver.findElement(mainTextConstructor).getText();
    }

    @Step("Wait for visible of createOrderButton")
    public void waitCreateOrderButton() {
        waitOfVisibleElement(driver, createOrderButton);
    }

    @Step("Wait for visible of accountProfileButton")
    public void waitAccountProfileButton() {
        waitOfVisibleElement(driver, accountProfileButton);
    }

    @Step("Open main page")
    public void openMainPage() {
        driver.get(BASE_URI);
    }
}