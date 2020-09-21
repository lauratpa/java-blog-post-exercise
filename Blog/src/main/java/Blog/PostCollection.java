package Blog;

import java.util.List;
import java.util.ArrayList;

public class PostCollection {
    private List<Postable> collection = new ArrayList<>();

    public void addTextPost(String title, String content) {
        this.collection.add(new TextPost(title, content));
    }

    public void addPhotoPost(String title, String url) {
        this.collection.add(new PhotoPost(title, url));
    }

    public List<Postable> getAll() {
        return this.collection;
    }
}
