package io.qameta.samples.webtests.step;

import com.google.inject.Inject;
import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.samples.webtests.webdriver.WebDriverManager;
import org.openqa.selenium.WebDriver;

/**
 * eroshenkoam
 * 06.03.17
 */
public class WebDriverSteps {

    private final WebDriverManager driverManager;

    @Inject
    public WebDriverSteps(WebDriverManager driverManager) {
        this.driverManager = driverManager;
    }

    protected <T extends WebPage> T on(Class<T> pageClass) {
        return new WebPageFactory().get(getWebDriver(), pageClass);
    }

    protected WebDriver getWebDriver() {
        return driverManager.getWebDriver();
    }

}
