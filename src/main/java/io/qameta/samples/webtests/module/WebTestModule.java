package io.qameta.samples.webtests.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.multibindings.Multibinder;
import io.qameta.samples.webtests.WebTestConfig;
import io.qameta.samples.webtests.junit.WebDriverResource;
import org.aeonbits.owner.ConfigFactory;
import org.junit.rules.TestRule;

/**
 * eroshenkoam
 * 06.03.17
 */
public class WebTestModule extends AbstractModule {

    @Override
    protected void configure() {
        Multibinder<TestRule> rulesBinder = Multibinder.newSetBinder(binder(), TestRule.class);
        rulesBinder.addBinding().to(WebDriverResource.class);

        install(new RuleChainModule());
        install(new WebDriverModule());
    }

    @Provides
    @Singleton
    public WebTestConfig provideWebTestConfig() {
        return ConfigFactory.newInstance().create(WebTestConfig.class);
    }
}
