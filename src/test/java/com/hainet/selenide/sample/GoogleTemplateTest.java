package com.hainet.selenide.sample;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTemplateTest {

    @Before
    public void before() {
        Configuration.browser = WebDriverRunner.CHROME;
        Configuration.timeout = 3_000L;
    }

    @Test
    public void searchFirstByCssSelectorTest() {
        open("https://www.google.co.jp/");
        $(byId("lst-ib")).val("site:projects.spring.io Spring Boot").pressEnter();
        $(byCssSelector("#rso > div > div > div:nth-child(1) > div > div > h3 > a")).click();
        sleep(3_000);
        close();
    }

    @Test
    public void searchFirstBySelenideElementsTest() {
        open("https://www.google.co.jp/");
        $(byId("lst-ib")).val("site:projects.spring.io Spring Boot").pressEnter();
        $$(byCssSelector("#rso > div > div")).first().$("div > div > h3 > a").click();
        sleep(3_000);
        close();
    }
}
