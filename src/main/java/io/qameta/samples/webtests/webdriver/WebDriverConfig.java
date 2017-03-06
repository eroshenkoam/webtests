package io.qameta.samples.webtests.webdriver;

import org.aeonbits.owner.Config;

/**
 * eroshenkoam
 * 06.03.17
 */
@Config.Sources({"classpath:{env}.properties", "classpath:local.properties"})
public interface WebDriverConfig extends Config {

    @Key("webdriver.browser.name")
    String getBrowserName();

    @Key("webdriver.browser.version")
    String getBrowserVersion();

}
