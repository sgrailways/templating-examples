Contributing
============

Pull requests welcome!

New templating engines should be included in their own module, implement the
`com.sgrailways.examples.templating.core.TemplateProcessor` interface, and
have a corresponding unit test.

Please run `mvn clean install` before submitting, which will run unit tests
in every module and checkstyle verification.
