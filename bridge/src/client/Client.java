package client;

public interface Client {
    String get(String url);
    String post(String url, String arg);
}
