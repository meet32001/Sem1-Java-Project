/**
 * IMAXMember represents a membership for IMAX movie screenings.
 * This class extends MovieMembership.
 */
public class IMAXMember extends MovieMembership {

    // Member variables
    private double discountRate = 0.5;
    private double pointsRate = 1.3;

    // Constructor 1
    IMAXMember(String memberName) {
        super(memberName);
    }

    // Constructor 2
    IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        setPoints(25);
    }

    /**
     * Overrides the method to return member details.
     * @return Details of the IMAX membership
     */
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails();
    }

    /**
     * Overrides the method to return membership rank.
     * @return The membership rank
     */
    @Override
    public String returnMembershipRank() {
        return "IMAX";
    }

    /**
     * Overrides the method to print member benefits.
     */
    @Override
    public void printMemberBenefits() {
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Points Rate: " + pointsRate);
    }

    /**
     * Overrides the method to purchase a movie ticket for IMAX members.
     * Calculates the price with discount, earns points, and displays the purchase details.
     * @param ticketPrice The price of the movie ticket
     * @param nextMovie The title of the next movie
     * @param theatreType The type of theatre (e.g., IMAX, 3D)
     * @param showHour The hour of the showtime
     * @param showMinute The minute of the showtime
     * @param snack The preferred snack for the movie
     */
    @Override
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
                                     int showMinute, String snack) {
        double priceWithDiscount = 0.0;
        int pointsEarned = 0;
        setNextMovie(nextMovie);
        setTheatreType(theatreType);
        setSnack(snack);
        setShowtime(showHour, showMinute);

        if (theatreType.equals("IMAX")) {
            priceWithDiscount = ticketPrice - (ticketPrice * discountRate);
            pointsEarned = (int) (ticketPrice * pointsRate);
            addPoints(pointsEarned);

            System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
                    + priceWithDiscount + " and will be showing at " + displayShowTime() + " with " + getTheatreType()
                    + " screening. They have earned " + pointsEarned + " points");
        }
    }
}
