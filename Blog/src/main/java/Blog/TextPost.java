package Blog;

import java.util.ArrayList;
import java.util.List;

public class TextPost implements Postable {
    private String title;
    private String content;
    private ArrayList<String> comments = new ArrayList<>();

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

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public List<String> getComments() {
        return this.comments;
    }
}
