package client;

public class HTTPClient implements Client {
    @Override
    public String get(String url) {

        return "fake http get response";
    }

    @Override
    public String post(String url, String arg) {
        return "fake http post response";
    }
}
