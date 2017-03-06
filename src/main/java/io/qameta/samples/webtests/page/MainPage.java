package io.qameta.samples.webtests.page;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.samples.webtests.element.SearchForm;

/**
 * eroshenkoam
 * 06.03.17
 */
public interface MainPage extends WebPage {

    @FindBy("//form[contains(@class,'search2')]")
    SearchForm searchForm();
}
