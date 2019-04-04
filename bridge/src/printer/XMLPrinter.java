package printer;

public class XMLPrinter implements Printer {
    @Override
    public String print(String content) {
        return "<head>content in XML</head><body>" + content + "</body>";
    }
}
