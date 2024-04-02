/**
 * Program Name: Meet Shah
 * Programming date: 1st April
 */

/**
 * SilverMember represents a Silver level movie membership.
 * This class extends the MovieMembership class and provides
 * additional functionality specific to Silver members.
 */
public class SilverMember extends MovieMembership {

    // Member variables
    private double discountRate = 0.0, pointsRate = 0.0;

    /**
     * Constructs a SilverMember object with the given member name.
     * Initializes discount rate and points rate to default values.
     * @param memberName The name of the member
     */
    SilverMember(String memberName) {
        super(memberName);
        this.discountRate = 0.1; // default discount rate
        this.pointsRate = 1.2; // default points rate
    }

    /**
     * Constructs a SilverMember object with specified parameters.
     * @param memberName The name of the member
     * @param discountRate The discount rate for silver members
     * @param pointsRate The points rate for silver members
     */
    SilverMember(String memberName, double discountRate, double pointsRate) {
        super(memberName);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    /**
     * Constructs a SilverMember object with specified parameters.
     * Initializes discount rate and points rate to default values.
     * @param memberName The name of the member
     * @param nextMovie The title of the next movie
     * @param theatreType The type of theatre (e.g., 3D, IMAX)
     * @param showHour The hour of the showtime
     * @param showMinute The minute of the showtime
     * @param snack The preferred snack for the movie
     */
    SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = 0.1; // default discount rate
        this.pointsRate = 1.2; // default points rate
    }

    /**
     * Constructs a SilverMember object with specified parameters.
     * @param memberName The name of the member
     * @param nextMovie The title of the next movie
     * @param theatreType The type of theatre (e.g., 3D, IMAX)
     * @param showHour The hour of the showtime
     * @param showMinute The minute of the showtime
     * @param snack The preferred snack for the movie
     * @param discountRate The discount rate for silver members
     * @param pointsRate The points rate for silver members
     */
    SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack,
                 double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    /**
     * Overrides the method in the superclass to return member details.
     * @return Details of the silver membership
     */
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails();
    }

    /**
     * Overrides the method in the superclass to print member benefits.
     */
    @Override
    public void printMemberBenefits() {
        System.out.println("Discounted Rate: " + discountRate + "%");
        System.out.println("Point Rate: " + pointsRate);
    }

    /**
     * Overrides the method in the superclass to return membership rank.
     * @return The membership rank
     */
    @Override
    public String returnMembershipRank() {
        return "Silver";
    }

    /**
     * Overrides the method in the superclass to purchase a movie ticket for silver members.
     * Calculates the price with discount, earns points, and displays the purchase details.
     * @param ticketPrice The price of the movie ticket
     * @param nextMovie The title of the next movie
     * @param theatreType The type of theatre (e.g., 3D, IMAX)
     * @param showHour The hour of the showtime
     * @param showMinute The minute of the showtime
     * @param snack The preferred snack for the movie
     */
    @Override
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
                                     int showMinute, String snack) {
        setNextMovie(nextMovie);
        setTheatreType(theatreType);
        setSnack(snack);
        setShowtime(showHour, showMinute);

        double priceWithDiscount = ticketPrice - (ticketPrice * discountRate);
        int pointsEarned = (int) (ticketPrice * pointsRate);
        addPoints(pointsEarned);

        System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
                + priceWithDiscount + " and will be showing at " + displayShowTime() + " with " + getTheatreType()
                + " screening. They have earned " + pointsEarned + " points");
    }
}
