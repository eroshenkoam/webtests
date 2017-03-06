package io.qameta.samples.webtests.element;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

/**
 * eroshenkoam
 * 06.03.17
 */
public interface SearchResult extends HtmlElement {

    @FindBy(".//h2/a")
    HtmlElement title();
}
