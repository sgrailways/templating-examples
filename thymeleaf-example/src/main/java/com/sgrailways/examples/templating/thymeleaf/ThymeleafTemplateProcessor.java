package com.sgrailways.examples.templating.thymeleaf;

import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.Locale;

public class ThymeleafTemplateProcessor implements TemplateProcessor {
    private final TemplateEngine templateEngine;

    public ThymeleafTemplateProcessor(TemplateEngine engine) {
        this.templateEngine = engine;
    }

    @Override
    public String processEngine(Engine engine) {
        return templateEngine.process("template.xml", new Context(Locale.US, engine.toMap()));
    }
}
