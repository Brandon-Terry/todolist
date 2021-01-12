package wcci.exercise.todolist;

public class Book {
    private String title;
    private String author;
    private String description;
    private String imageURL;
    private String review;
    private String rating;
    private long id;

    public Book(String title, String author, String description, String imageURL, String review, String rating, long id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.description = description;
        this.imageURL = imageURL;
        this.review = review;
        this.rating = rating;
    }
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getReview() {
        return review;
    }

    public String getRating() {
        return rating;
    }
}
