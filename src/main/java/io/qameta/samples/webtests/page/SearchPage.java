package io.qameta.samples.webtests.page;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.samples.webtests.element.SearchResults;

/**
 * eroshenkoam
 * 06.03.17
 */
public interface SearchPage extends WebPage {

    @FindBy("//ul[contains(@class,'serp-list')]")
    SearchResults searchResults();
}
