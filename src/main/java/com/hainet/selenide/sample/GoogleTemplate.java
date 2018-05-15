package com.hainet.selenide.sample;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTemplate {

    public void search(final String q) {
        open("https://www.google.co.jp/");
        $(byId("lst-ib")).val(q).pressEnter();
        $(byCssSelector("#rso > div > div > div:nth-child(1) > div > div > h3 > a")).click();
        sleep(3_000);
        close();
    }
}
