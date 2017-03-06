package io.qameta.samples.webtests.module;

import com.google.inject.AbstractModule;
import io.qameta.samples.webtests.provider.RuleChainProvider;
import org.junit.rules.RuleChain;

/**
 * eroshenkoam
 * 06.03.17
 */
public class RuleChainModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(RuleChain.class).toProvider(RuleChainProvider.class);
    }

}