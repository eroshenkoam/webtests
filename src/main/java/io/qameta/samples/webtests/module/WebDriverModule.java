package io.qameta.samples.webtests.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import io.qameta.samples.webtests.guice.ThreadLocalScope;
import io.qameta.samples.webtests.webdriver.DefaultWebDriverManager;
import io.qameta.samples.webtests.webdriver.WebDriverConfig;
import io.qameta.samples.webtests.webdriver.WebDriverManager;
import org.aeonbits.owner.ConfigFactory;

/**
 * eroshenkoam
 * 06.03.17
 */
public class WebDriverModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(WebDriverManager.class).to(DefaultWebDriverManager.class).in(new ThreadLocalScope());
    }

    @Provides
    @Singleton
    protected WebDriverConfig provideWebDriverConfig() {
        return ConfigFactory.newInstance().create(WebDriverConfig.class);
    }
}
