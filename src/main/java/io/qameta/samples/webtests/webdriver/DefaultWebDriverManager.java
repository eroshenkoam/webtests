package io.qameta.samples.webtests.webdriver;

import com.google.inject.Inject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * eroshenkoam
 * 06.03.17
 */
public class DefaultWebDriverManager implements WebDriverManager {

    private WebDriver driver;

    private final WebDriverConfig config;

    @Inject
    public DefaultWebDriverManager(WebDriverConfig config) {
        this.config = config;
    }

    @Override
    public void startWebDriver() {
        //TODO: use config here
        driver = new ChromeDriver();
    }

    @Override
    public void stopWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getWebDriver() {
        return driver;
    }

}
