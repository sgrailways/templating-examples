package com.sgrailways.examples.templating.freemarker;

import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;

public class FreemarkerTemplateProcessor implements TemplateProcessor {
    private final Configuration configuration;

    public FreemarkerTemplateProcessor(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public String processEngine(Engine engine) {
        StringWriter writer = new StringWriter();
        try {
            configuration.getTemplate("template.xml.ftl").process(engine, writer);
            return writer.toString();
        } catch (TemplateException | IOException e) {
            return "";
        }
    }
}
