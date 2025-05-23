public class Book implements MediaItem, Rentable {
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    private boolean availabilityStatus;

    public Book(String title, String author, int publicationYear, String ISBN, boolean availabilityStatus) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYearOfPublication() {
        return publicationYear;
    }

    @Override
    public String getFormatedString() {
        return "Title: " + title + " " + "Author: " + author + " " + "Publication year: " + publicationYear + " " + "ISBN: " + ISBN + " " + "Availability status: " + availabilityStatus;
    }

    @Override
    public boolean checkAvailability() {
        return availabilityStatus;
    }

    @Override
    public boolean rentItem() {
        if (availabilityStatus) {
            availabilityStatus = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean isItemRented() {
        if (availabilityStatus) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean returnItem() {
        if (isItemRented()) {
            availabilityStatus = true;
            return true;
        } else {
            return false;
        }
    }
}
