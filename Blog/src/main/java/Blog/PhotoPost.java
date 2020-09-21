package Blog;

public class PhotoPost implements Postable {
    private String title;
    private String url;

    public PhotoPost(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public String getTitle() {
        return this.title;
    }
}
