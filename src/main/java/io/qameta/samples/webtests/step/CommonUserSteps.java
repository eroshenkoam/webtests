package io.qameta.samples.webtests.step;

import com.google.inject.Inject;
import io.qameta.samples.webtests.WebTestConfig;
import io.qameta.samples.webtests.element.SearchResult;
import io.qameta.samples.webtests.page.MainPage;
import io.qameta.samples.webtests.page.SearchPage;
import io.qameta.samples.webtests.webdriver.WebDriverManager;
import org.hamcrest.Matcher;
import org.openqa.selenium.WebElement;

import java.util.Collection;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.everyItem;

/**
 * eroshenkoam
 * 06.03.17
 */
public class CommonUserSteps extends WebDriverSteps {

    private final WebTestConfig config;

    @Inject
    public CommonUserSteps(WebTestConfig config, WebDriverManager driverManager) {
        super(driverManager);
        this.config = config;
    }

    public void openMainPage() {
        onMainPage().open(config.getUrl());
    }

    public void searchByRequest(String request){
        onMainPage().searchForm().requestInput()
                .sendKeys(request);
        onMainPage().searchForm().searchButton()
                .click();
        onSearchPage().searchResults()
                .waitUntil(WebElement::isDisplayed);
    }

    public void searchResultsShouldBe(Matcher<Collection<?>> matcher) {
        onSearchPage().searchResults().results()
                .should(matcher);
    }

    public void everrySearchResultTitleShoulContains(String word) {
        onSearchPage().searchResults().results()
                .filter(WebElement::isDisplayed)
                .convert(SearchResult::title)
                .convert(WebElement::getText)
                .convert(String::toLowerCase)
                .should(everyItem(containsString(word)));
    }

    private MainPage onMainPage() {
        return on(MainPage.class);
    }

    private SearchPage onSearchPage() {
        return on(SearchPage.class);
    }

}
