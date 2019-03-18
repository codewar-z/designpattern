package printer;

public class StringPrinter implements Printer {
    @Override
    public String print(String content) {
        return "The content in string: " + content;
    }
}
