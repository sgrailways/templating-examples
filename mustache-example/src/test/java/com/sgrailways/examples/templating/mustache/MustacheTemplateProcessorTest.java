package com.sgrailways.examples.templating.mustache;

import com.github.mustachejava.DefaultMustacheFactory;
import com.sgrailways.examples.templating.core.TemplateProcessor;
import com.sgrailways.examples.templating.core.TestConstants;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.xmlmatchers.XmlMatchers.isEquivalentTo;
import static org.xmlmatchers.transform.XmlConverters.the;

public class MustacheTemplateProcessorTest {

    @Test
    public void shouldProcessXml() {
        // Given
        TemplateProcessor processor = new MustacheTemplateProcessor(new DefaultMustacheFactory());

        // When
        String xml = processor.processEngine(TestConstants.ENGINE);

        // Then
        assertThat(the(xml), isEquivalentTo(the(TestConstants.EXPECTED_XML)));
    }
}