package browser;

public class Explorer {
    private String version;
    public Explorer(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public String open(String url) {
        System.out.println("fetching url:" + url);
        String fakeResponse = "some random content";

        return "content in string: " + fakeResponse;
    }
}
