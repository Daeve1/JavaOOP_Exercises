public class MovieMain {
    
    private String title;
    private String director;
    private String[] actors;
    private String[] reviews;
    private int reviewCount;

   
    public MovieMain(String title, String director, String[] actors, int maxReviews) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.reviews = new String[maxReviews];
        this.reviewCount = 0;
    }

   
    public void addReview(String review) {
        if (reviewCount < reviews.length) {
            reviews[reviewCount++] = review;
            System.out.println("Review added: " + review);
        } else {
            System.out.println("Cannot add more reviews!");
        }
    }

  
    public void displayReviews() {
        System.out.println("\n--- Reviews for \"" + title + "\" ---");
        if (reviewCount == 0) {
            System.out.println("No reviews yet.");
        } else {
            for (int i = 0; i < reviewCount; i++) {
                System.out.println((i + 1) + ". " + reviews[i]);
            }
        }
    }

   
    public void displayMovieDetails() {
        System.out.println("\n=== Movie Information ===");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors:");
        for (String actor : actors) {
            System.out.println("- " + actor);
        }
    }

  
    public static void main(String[] args) {
        String[] actorList = {"Tom Hanks", "Robin Wright", "Gary Sinise"};
        MovieMain movie = new MovieMain("Forrest Gump", "Robert Zemeckis", actorList, 5);

        movie.displayMovieDetails();

        movie.addReview("A heartwarming classic!");
        movie.addReview("Tom Hanks delivers a brilliant performance.");
        movie.addReview("Emotional and inspiring story.");

        movie.displayReviews();
    }
}
