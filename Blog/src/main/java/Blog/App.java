package Blog;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        PostCollection posts = new PostCollection();
        posts.addTextPost("My first post", "What a great blog!");
        posts.addPhotoPost("My cat", "http://a-random-cat.com/1");
    }
}
