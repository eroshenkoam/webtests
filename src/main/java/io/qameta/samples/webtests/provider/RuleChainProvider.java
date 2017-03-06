package io.qameta.samples.webtests.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

import java.util.Set;

/**
 * eroshenkoam
 * 06.03.17
 */
public class RuleChainProvider implements Provider<RuleChain> {

    private final Set<TestRule> rules;

    @Inject
    public RuleChainProvider(Set<TestRule> rules) {
        this.rules = rules;
    }

    protected Set<TestRule> getRules() {
        return rules;
    }

    @Override
    public RuleChain get() {
        RuleChain ruleChain = RuleChain.emptyRuleChain();
        for (TestRule rule : getRules()) {
            ruleChain = ruleChain.around(rule);
        }
        return ruleChain;
    }

}