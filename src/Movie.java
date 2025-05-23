import java.util.ArrayList;

public class Movie implements MediaItem, Rentable, Rateable {
    private String title;
    private String director;
    private int releaseYear;
    private int duration;
    private boolean availabilityStatus;
    private ArrayList<Integer> ratings;
    public Movie(String title, String director, int releaseYear, int duration) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.duration = duration;
        ratings = new ArrayList<>();
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYearOfPublication() {
        return releaseYear;
    }

    @Override
    public String getFormatedString() {
        return "Title: " + title + " " + "Director: " + director + " " + "Year: " + releaseYear + " " + "Duration: " + duration + " " + "Availability status: " + availabilityStatus + " " + "Ratings: " + ratings;
    }

    @Override
    public void addRating(int rating) {
        ratings.add(rating);
    }

    @Override
    public double getAverageRating() {
        double sumRating = 0.0;
        for (Integer rating : ratings) {
            sumRating += rating;
        }

        return sumRating / ratings.size();
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
