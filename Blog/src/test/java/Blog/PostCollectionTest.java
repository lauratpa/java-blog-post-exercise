package Blog;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class PostCollectionTest {

    @Test
    public void canAddPostsToCollection() {
        PostCollection posts = new PostCollection();

        String textTitle = "My first awesome post!";
        String photoTitle = "My lovely cat";

        ArrayList<String> expectedTitles = new ArrayList<String>(Arrays.asList(textTitle, photoTitle));

        posts.addTextPost(textTitle, "What a great blog!");
        posts.addPhotoPost(photoTitle, "http://a-random-cat.com/1");

        ArrayList<String> titles = new ArrayList<>();

        for (Postable post : posts.getAll()) {
            titles.add(post.getTitle());
        }

        assertEquals(expectedTitles, titles);
    }
}
