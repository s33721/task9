public interface Rentable {
    int MAX_RENTAL_DAYS = 14;
    static double calculateLateFee(int daysLate){
        return daysLate * 0.5;
    }
    boolean  checkAvailability();
    boolean rentItem();
    boolean returnItem();
}
