package io.qameta.samples.webtests.webdriver;

import org.openqa.selenium.WebDriver;

/**
 * eroshenkoam
 * 06.03.17
 */
public interface WebDriverManager {

    WebDriver getWebDriver();

    void stopWebDriver();

    void startWebDriver();

}
