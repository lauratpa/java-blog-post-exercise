package Blog;

import java.util.ArrayList;
import java.util.List;

public class PhotoPost implements Postable {
    private String title;
    private String url;
    private ArrayList<String> comments = new ArrayList<>();

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

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public List<String> getComments() {
        return this.comments;
    }
}
