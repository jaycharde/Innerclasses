import java.util.ArrayList;

public class Product {
    private String title;
    private int id;
    private double price;
    private ArrayList<Review> reviews;


    public Product(String title, int id, double price) {
        this.title = title;
        this.id = id;
        this.price = price;
        this.reviews = new ArrayList<>();
    }


    public class Review {                       // Inner Review class
        private float rating;
        private String body;
        private String title;


        public Review(float rating, String body, String title) {    // Constructor for Review
            this.rating = rating;
            this.body = body;
            this.title = title;
        }


        @Override                                   // Method to get the review details as a string
        public String toString() {
            return "Review Title: " + title + "\nRating: " + rating + "\nBody: " + body + "\n";
        }
    }


    public void addReview(float rating, String body, String title) {     // Method to add a review
        Review review = new Review(rating, body, title);
        reviews.add(review);
    }


    public void printReviews() {       // Method to print all reviews
        if (reviews.isEmpty()) {
            System.out.println("No reviews available.");
        } else {
            for (Review review : reviews) {
                System.out.println(review);
            }
        }
    }


    public static void main(String[] args) {
        Product product = new Product("Laptop", 101, 999.99);


        product.addReview(4.5f, "Great laptop with excellent battery life.", "Excellent!");        // Adding reviews
        product.addReview(3.0f, "Good performance but could be better.", "Average performance");


        product.printReviews();     // Printing reviews
    }
}

