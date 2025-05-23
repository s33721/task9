public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to " + MediaItem.LIBRARY_NAME);
        System.out.println("Maximum rental period: " + Rentable.MAX_RENTAL_DAYS + " days\n");

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "978-0-7432-7356-5");
        System.out.println(book1.getFormatedString());
        System.out.println("Available: " + book1.checkAvailability());

        if (book1.rentItem()) {
            System.out.println("Book rented successfully!");
        }
        System.out.println("Available after rental: " + book1.checkAvailability());

        System.out.println("Late fee for 3 days: $" + Rentable.calculateLateFee(3));

        book1.returnItem();
        System.out.println("Available after return: " + book1.checkAvailability() + "\n");

        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2010, 148);
        System.out.println(movie1.getFormatedString());

        movie1.addRating(5);
        movie1.addRating(4);
        movie1.addRating(5);
        System.out.println("Average rating: " + movie1.getAverageRating() + " stars");

        if (movie1.rentItem()) {
            System.out.println("Movie rented successfully!");
        }

        if (!movie1.rentItem()) {
            System.out.println("Movie is already rented!");
        }
    }
}

