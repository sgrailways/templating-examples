package com.sgrailways.examples.templating.thymeleaf;

import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ThymeleafTemplateProcessor implements TemplateProcessor {
    private final TemplateEngine templateEngine;

    public ThymeleafTemplateProcessor(TemplateEngine engine) {
        this.templateEngine = engine;
    }

    @Override
    public String processEngine(Engine engine) {
        Map<String, String> variables = new HashMap<String, String>();
        variables.put("type", engine.getType());
        variables.put("name", engine.getName());
        variables.put("configuration", engine.getConfiguration());
        return templateEngine.process("template.xml", new Context(Locale.US, variables));
    }
}
