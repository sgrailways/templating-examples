package com.sgrailways.examples.templating.handlebars;

import com.github.jknack.handlebars.Handlebars;
import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;

import java.io.IOException;

public class HandlebarsTemplateProcessor implements TemplateProcessor {
    private final Handlebars handlebars;

    public HandlebarsTemplateProcessor(Handlebars handlebars) {
        this.handlebars = handlebars;
    }

    @Override
    public String processEngine(Engine engine) {
        try {
            return handlebars.compile("template.xml").apply(engine);
        } catch (IOException e) {
            return "";
        }
    }
}
