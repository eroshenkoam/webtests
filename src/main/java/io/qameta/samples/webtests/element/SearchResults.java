package io.qameta.samples.webtests.element;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.ExtendedList;
import io.qameta.htmlelements.element.HtmlElement;

/**
 * eroshenkoam
 * 06.03.17
 */
public interface SearchResults extends HtmlElement{

    @FindBy(".//li[@class='serp-item t-construct-adapter__legacy']")
    ExtendedList<SearchResult> results();
}
