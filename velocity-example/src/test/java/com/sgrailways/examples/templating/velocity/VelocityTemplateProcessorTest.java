package com.sgrailways.examples.templating.velocity;

import com.sgrailways.examples.templating.core.TemplateProcessor;
import com.sgrailways.examples.templating.core.TestConstants;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.xmlmatchers.XmlMatchers.isEquivalentTo;
import static org.xmlmatchers.transform.XmlConverters.the;

public class VelocityTemplateProcessorTest {

    @Test
    public void shouldProcessXml() {
        // Given
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.addProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
        velocityEngine.addProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
        velocityEngine.init();
        TemplateProcessor processor = new VelocityTemplateProcessor(velocityEngine);

        // When
        String xml = processor.processEngine(TestConstants.ENGINE);

        // Then
        assertThat(the(xml), isEquivalentTo(the(TestConstants.EXPECTED_XML)));
    }
}
