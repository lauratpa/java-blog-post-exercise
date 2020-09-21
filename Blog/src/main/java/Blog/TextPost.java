package Blog;

public class TextPost implements Postable {
    private String title;
    private String content;

    public TextPost(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public String getTitle() {
        return this.title;
    }
}
