package com.sgrailways.examples.templating.velocity;

import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import java.io.StringWriter;

public class VelocityTemplateProcessor implements TemplateProcessor {
    private final VelocityEngine velocityEngine;

    public VelocityTemplateProcessor(VelocityEngine velocityEngine) {
        this.velocityEngine = velocityEngine;
    }

    @Override
    public String processEngine(Engine engine) {
        Template template = velocityEngine.getTemplate("template.xml.vm");
        StringWriter writer = new StringWriter();
        template.merge(new VelocityContext(engine.toMap()), writer);
        return writer.toString();
    }
}
