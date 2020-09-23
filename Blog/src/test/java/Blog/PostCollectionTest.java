package Blog;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.Ignore;

public class PostCollectionTest {
    String textTitle = "My first awesome post!";
    String photoTitle = "My lovely cat";
    String videoTitle = "Cat loves to scratch the couch";

    String contents = "What a great blog!";
    String photoUrl = "http://a-random-cat.com/1.png";
    String videoUrl = "http://a-random-cat.com/1/scratching.png";

    @Test
    public void canAddPostsToCollection() {
        // Arrange
        PostCollection posts = new PostCollection();

        ArrayList<String> expectedTitles = new ArrayList<String>(Arrays.asList(textTitle, photoTitle));

        // Act
        posts.addTextPost(textTitle, contents);
        posts.addPhotoPost(photoTitle, photoUrl);

        // Assert
        ArrayList<String> titles = new ArrayList<>();
        for (Postable post : posts.getAll()) {
            titles.add(post.getTitle());
        }

        assertEquals(expectedTitles, titles);
    }

    // @Ignore("methods for adding comments to be implemented")
    // @Test
    // public void canAddCommentsToPosts() {
    // // Arrange
    // TextPost textPost = new TextPost(textTitle, contents);
    // PhotoPost photoPost = new PhotoPost(photoTitle, photoUrl);
    // String firstComment = "So deep...";
    // String secondComment = "Beautiful!";

    // // Act
    // textPost.addComment(firstComment);
    // photoPost.addComment(secondComment);

    // // Assert
    // assertEquals(firstComment, textPost.getComments().get(0));
    // assertEquals(secondComment, photoPost.getComments().get(0));
    // }

    // @Ignore("methods for adding reviews to be implemented")
    // @Test
    // public void canAddReviewsToPosts() {
    // // Arrange
    // TextPost textPost = new TextPost(textTitle, contents);
    // PhotoPost photoPost = new PhotoPost(photoTitle, photoUrl);

    // Integer firstReview = 1;
    // Integer secondReview = 3;

    // // Act
    // textPost.addReview(firstReview);
    // photoPost.addReview(secondReview);

    // // Assert
    // assertEquals(firstReview, textPost.getReviews().get(0));
    // assertEquals(secondReview, photoPost.getReviews().get(0));
    // }

    // @Ignore("create video post")
    // @Test
    // public void canCreateVideoPosts() {
    // // Arrange
    // VideoPost videoPost = new VideoPost(textTitle, videoUrl);
    // String comment = "Needs more cats";

    // // Act
    // videoPost.addComment(comment);

    // // Assert
    // assertEquals(comment, videoPost.getComments().get(0));
    // }

    // @Ignore("add video post")
    // @Test
    // public void canAddVideoPostsToCollection[() {
    // // Arrange
    // PostCollection posts = new PostCollection();

    // ArrayList<String> expectedTitles = new
    // ArrayList<String>(Arrays.asList(textTitle, videoTitle));

    // // Act
    // posts.addVideoPost(videoTitle, videoUrl);

    // // Assert
    // ArrayList<String> titles = new ArrayList<>();
    // for (Postable post : posts.getAll()) {
    // titles.add(post.getTitle());
    // }

    // assertEquals(videoTitle, titles.get(0));
    // }

    // @Ignore("can add text reviews to post")
    // @Test
    // public void canAddReviewsToVideoPosts() {
    // // Arrange
    // VideoPost videoPost = new VideoPost(textTitle, videoUrl);
    // String review = "Nice";

    // // Act
    // videoPost.addReview(review);

    // // Assert
    // assertEquals(review, videoPost.getReview().get(0));
    // }
}
