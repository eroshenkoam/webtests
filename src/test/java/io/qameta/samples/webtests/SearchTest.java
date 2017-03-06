package io.qameta.samples.webtests;

import com.carlosbecker.guice.GuiceModules;
import com.carlosbecker.guice.GuiceTestRunner;
import com.google.inject.Inject;
import io.qameta.samples.webtests.module.WebTestModule;
import io.qameta.samples.webtests.step.CommonUserSteps;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.runner.RunWith;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

/**
 * eroshenkoam
 * 06.03.17
 */
@RunWith(GuiceTestRunner.class)
@GuiceModules({WebTestModule.class})
public class SearchTest {

    @Rule
    @Inject
    public RuleChain rules;

    @Inject
    private CommonUserSteps commonUser;

    @Test
    public void testOutput() {
        String request = "погода";

        commonUser.openMainPage();
        commonUser.searchByRequest(request);
        commonUser.searchResultsShouldBe(hasSize(10));
        commonUser.everrySearchResultTitleShoulContains(request);
    }

}
