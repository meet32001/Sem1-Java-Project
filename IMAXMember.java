public class IMAXMember extends MovieMembership {
    private double discountRate = 0.5, pointsRate = 1.3;
    private static final int INITIAL_POINTS = 25;

    IMAXMember(String memberName) {
        super(memberName);
    }

    IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack);
    }

    public String getMemberDetails() {
        return super.getMemberDetails() + " " + returnMembershipRank();
    }

    @Override
    public String returnMembershipRank() {
        return "\nMembership status:IMAX";
    }

    @Override
    public void printMemberBenefits() {
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Points Rate: " + pointsRate);
    }

    @Override
    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        double priceWithDiscount = 0.0;
        setNextMovie(nextMovie);
        setTheatreType(theatreType);
        setSnack(snack);

        if (theatreType == "IMAX") {
            priceWithDiscount = (ticketPrice * discountRate) / 100;
            int pointsEarned = (int) (ticketPrice * pointsRate);
            addPoints(pointsEarned);
        }

        System.out.println("The Movie " + getNextMovie() + " has been purchased by " + getMemberName() + " for "
                + priceWithDiscount + " and will be showing at " + displayShowTime() + " with " + getTheatreType()
                + " screening. They have earned " + getPoints() + " points");
    }

}
