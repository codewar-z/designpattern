package printer;

public class JSONPrinter implements Printer {
    @Override
    public String print(String content) {
        return "{'header': 'content in json format', 'body': '" + content + "'}";
    }
}
