package com.sgrailways.examples.templating.thymeleaf;

import com.sgrailways.examples.templating.core.TemplateProcessor;
import com.sgrailways.examples.templating.core.TestConstants;
import org.junit.Test;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

import static org.junit.Assert.assertThat;
import static org.xmlmatchers.XmlMatchers.isEquivalentTo;
import static org.xmlmatchers.transform.XmlConverters.the;

public class ThymeleafTemplateProcessorTest {

    @Test
    public void shouldProcessXml() {
        // Given
        TemplateEngine te = new TemplateEngine();
        te.setTemplateResolver(new ClassLoaderTemplateResolver());
        TemplateProcessor processor = new ThymeleafTemplateProcessor(te);

        // When
        String xml = processor.processEngine(TestConstants.ENGINE);

        // Then
        assertThat(the(xml), isEquivalentTo(the(TestConstants.EXPECTED_XML)));
    }
}
