package com.sgrailways.examples.templating.core;

public final class TestConstants {
    public static final Engine ENGINE = new Engine("Steam", "Best Friend of Charleston", "0-4-0");
    public static final String EXPECTED_XML = "<engine type=\"Steam\">" +
            "    <name>Best Friend of Charleston</name>" +
            "    <configuration>0-4-0</configuration>" +
            "</engine>";

    private TestConstants() {
    }
}
