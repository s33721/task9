import java.util.ArrayList;

public interface Rateable {
    ArrayList<Integer> ratings = new ArrayList<Integer>();

    void addRating(int rating);

    double getAverageRating();
}
