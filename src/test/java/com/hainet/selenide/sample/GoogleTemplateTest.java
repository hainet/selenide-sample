package com.hainet.selenide.sample;

import org.junit.Test;

public class GoogleTemplateTest {

    @Test
    public void searchTest() {
        final GoogleTemplate template = new GoogleTemplate();
        template.search("Spring Boot");
    }
}
