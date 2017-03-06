package io.qameta.samples.webtests.element;

import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

/**
 * eroshenkoam
 * 06.03.17
 */
public interface SearchForm extends HtmlElement {

    @FindBy("//input[@id='text']")
    HtmlElement requestInput();

    @FindBy(".//div[contains(@class, 'search2__button')]//button")
    HtmlElement searchButton();

}
