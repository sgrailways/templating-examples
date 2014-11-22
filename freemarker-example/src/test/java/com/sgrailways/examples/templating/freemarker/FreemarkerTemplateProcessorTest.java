package com.sgrailways.examples.templating.freemarker;

import com.sgrailways.examples.templating.core.TemplateProcessor;
import com.sgrailways.examples.templating.core.TestConstants;
import freemarker.template.Configuration;
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.xmlmatchers.XmlMatchers.isEquivalentTo;
import static org.xmlmatchers.transform.XmlConverters.the;

public class FreemarkerTemplateProcessorTest {

    @Test
    public void shouldProcessXml() {
        // Given
        Configuration cfg = new Configuration(Configuration.VERSION_2_3_21);
        cfg.setDefaultEncoding("UTF-8");
        cfg.setClassForTemplateLoading(FreemarkerTemplateProcessorTest.class, "/");
        TemplateProcessor processor = new FreemarkerTemplateProcessor(cfg);

        // When
        String xml = processor.processEngine(TestConstants.ENGINE);

        // Then
        assertThat(the(xml), isEquivalentTo(the(TestConstants.EXPECTED_XML)));
    }
}