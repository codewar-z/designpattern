package browser;

import printer.HTMLPrinter;
import printer.Printer;

abstract public class Browser {
    private String version;

    public String getVersion() {
        return version;
    }

    public Browser(String version) {
        this.version = version;
    }

    abstract public String open(String url, Printer contentPrinter);
    abstract public String open(String url, HTMLPrinter contentPrinter);
}
