package com.sgrailways.examples.templating.mustache;

import com.github.mustachejava.MustacheFactory;
import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;

import java.io.StringWriter;

public class MustacheTemplateProcessor implements TemplateProcessor {
    private final MustacheFactory factory;

    public MustacheTemplateProcessor(MustacheFactory factory) {
        this.factory = factory;
    }

    @Override
    public String processEngine(Engine engine) {
        StringWriter writer = new StringWriter();
        factory.compile("template.xml.mustache").execute(writer, engine);
        return writer.toString();
    }
}
