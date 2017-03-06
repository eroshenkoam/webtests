package io.qameta.samples.webtests.junit;

import com.google.inject.Inject;
import io.qameta.samples.webtests.webdriver.WebDriverManager;
import org.junit.rules.ExternalResource;

/**
 * eroshenkoam
 * 06.03.17
 */
public class WebDriverResource extends ExternalResource {

    private final WebDriverManager manager;

    @Inject
    public WebDriverResource(WebDriverManager manager) {
        this.manager = manager;
    }

    protected void before() throws Throwable {
        manager.startWebDriver();
    }

    protected void after() {
        manager.stopWebDriver();
    }

}
