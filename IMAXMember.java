public class IMAXMember extends MovieMembership {
    private double discountRate = 0.5, pointsRate = 1.3;
    private static final int INITIAL_POINTS = 25;

    IMAXMember(String memberName) {
        super(memberName);
    }

    IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
        setpoint(INITIAL_POINTS);
    }

    public String getMemberDetails() {
        return super.getMemberDetails();
    }

    @Override
    public String returnMembershipRank() {
        return "IMAX Membership.";
    }

    @Override
    public void printMemberBenefits() {
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Points Rate: " + pointsRate);
    }

    @Override
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        double priceWithDiscount = 0.0;
        int pointsEarned =0;
        setNextMovie(nextMovie);
        setTheatreType(theatreType);
        setSnack(snack);
        setShowtime(showHour, showMinute);


        if (theatreType == "IMAX") {
            priceWithDiscount = ticketPrice - (ticketPrice * discountRate);
            pointsEarned = (int) (ticketPrice * pointsRate);
            addPoints(pointsEarned);

            System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
            + priceWithDiscount + " and will be showing at " + displayShowTime() + " with " + getTheatreType()
            + " screening. They have earned " + pointsEarned + " points");
        }  
    }
}
