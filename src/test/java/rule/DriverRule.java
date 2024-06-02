package rule;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.Getter;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@Getter
public class DriverRule extends ExternalResource {
    private WebDriver driver;

    @Override
    protected void before(){
        initDriver();
    }

    @Override
    protected void after(){
        driver.quit();
    }

    public void initDriver(){
        if("yabrowser".equals(System.getProperty("browser"))){
            initYaBrowser();
        } else {
            initChrome();
        }
    }

    private void initChrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    private void initYaBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("C:\\Users\\anduser\\AppData\\Local\\Yandex\\YandexBrowser\\Application\\browser.exe");
        driver = new ChromeDriver(chromeOptions);
    }
}