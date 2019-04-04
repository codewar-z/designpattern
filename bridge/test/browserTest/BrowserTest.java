package browserTest;

import browser.Chrome;
import browser.Explorer;
import org.junit.Test;
import printer.*;

import static org.junit.Assert.assertEquals;


public class BrowserTest {
    @Test
    public void explorerTest() {
        Explorer browser = new Explorer("10.0");
        String content = browser.open("google.com");

        assertEquals("10.0", browser.getVersion());
        assertEquals("content in string: some random content", content);
    }

    @Test
    public void chromeTest() {
        Printer stringPrinter = new StringPrinter();
        Printer XMLPrinter = new XMLPrinter();
        Printer JSONPrinter = new JSONPrinter();
        HTMLPrinter htmlPrinter = new HTMLPrinter();
        Chrome browser = new Chrome("10.0");


        String stringContent = browser.open("google.com", stringPrinter);
        String xmlContent = browser.open("google.com", XMLPrinter);
        String jsonContent = browser.open("google.com", JSONPrinter);
        String htmlContent = browser.open("google.com", htmlPrinter);

        assertEquals("10.0", browser.getVersion());
        assertEquals("The content in string: some random content", stringContent);
        assertEquals("<head>content in XML</head><body>some random content</body>", xmlContent);
        assertEquals("{'header': 'content in json format', 'body': 'some random content'}", jsonContent);
        assertEquals("{'header': 'content in json format', 'body': 'some random content'}",htmlContent );
    }
}
