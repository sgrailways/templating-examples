package com.sgrailways.examples.templating.core;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    private final String type;
    private final String name;
    private final String configuration;

    public Engine(String type, String name, String configuration) {
        this.type = type;
        this.name = name;
        this.configuration = configuration;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getConfiguration() {
        return configuration;
    }

    public Map<String, String> toMap() {
        Map<String, String> map = new HashMap<>();
        map.put("type", type);
        map.put("name", name);
        map.put("configuration", configuration);
        return map;
    }
}
