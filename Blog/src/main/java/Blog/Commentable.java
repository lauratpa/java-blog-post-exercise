package Blog;

import java.util.List;

public interface Commentable {
    public void addComment(String comment);

    public List<String> getComments();
}
