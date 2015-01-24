package com.sgrailways.examples.templating.stringtemplate;

import com.sgrailways.examples.templating.core.Engine;
import com.sgrailways.examples.templating.core.TemplateProcessor;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class StringTemplateTemplateProcessor implements TemplateProcessor {
    private static final char DELIMITER = '$';

    @Override
    public String processEngine(Engine engine) {
        STGroup file = new STGroupFile("template.xml.stg", DELIMITER, DELIMITER);
        ST engineTemplate = file.getInstanceOf("engine");
        engineTemplate.add("type", engine.getType());
        engineTemplate.add("name", engine.getName());
        engineTemplate.add("configuration", engine.getConfiguration());
        return engineTemplate.render();
    }
}
