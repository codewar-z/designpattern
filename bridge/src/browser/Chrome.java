package browser;

import printer.HTMLPrinter;
import printer.Printer;

public class Chrome extends Browser {
    public Chrome(String version) {
        super(version);
    }

    public String open(String url, Printer contentPrinter) {
        System.out.println("fetching url:" + url);
        String fakeRsponse = "some random content";
        return contentPrinter.print(fakeRsponse);
    }

    public String open(String url, HTMLPrinter contentPrinter) {
        System.out.println("fetching url:" + url);
        String fakeRsponse = "some random content";
        return contentPrinter.print(fakeRsponse);
    }
}
