/**
 * Program Name: Meet Shah
 * Programming date: 1st April
 * MovieMembership represents a membership card for a movie theater.
 * This is an abstract class providing basic functionalities and properties
 * for different types of movie memberships.
 */
public abstract class MovieMembership {

    // Member variables
    private String memberName, nextMovie, theatreType, snack;
    private int showHour, showMinutes, points;

    /**
     * Constructs a MovieMembership object with a given member name.
     * Initializes other properties to default values.
     * 
     * @param memberName The name of the member
     */
    MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unknown";
        this.theatreType = "";
        this.showHour = 0;
        this.showMinutes = 0;
        this.snack = "unknown";
        this.points = 0;
    }

    /**
     * Constructs a MovieMembership object with specified parameters.
     * 
     * @param memberName  The name of the member
     * @param nextMovie   The title of the next movie
     * @param theatreType The type of theatre (e.g., 3D, IMAX)
     * @param showHour    The hour of the showtime
     * @param showMinute  The minute of the showtime
     * @param snack       The preferred snack for the movie
     */
    MovieMembership(String memberName, String nextMovie, String theatreType, int showHour, int showMinute,
            String snack) {
        this.memberName = memberName;
        this.nextMovie = nextMovie;
        this.theatreType = theatreType;
        this.showHour = showHour;
        this.showMinutes = showMinute;
        this.snack = snack;
    }

    // Getter methods

    public String getMemberName() {
        return memberName;
    }

    public String getNextMovie() {
        return nextMovie;
    }

    public int getPoints() {
        return points;
    }

    public String getTheatreType() {
        return theatreType;
    }

    public String getSnack() {
        return snack;
    }

    // Setter methods

    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

    public void setShowtime(int hour, int minute) {
        this.showHour = hour;
        this.showMinutes = minute;
    }

    /**
     * Returns the formatted showtime string.
     * 
     * @return The formatted showtime string (e.g., "12:30")
     */
    public String displayShowTime() {
        return this.showHour + ":" + this.showMinutes;
    }

    /**
     * Adds points to the membership.
     * 
     * @param points The points to be added
     */
    public void addPoints(int points) {
        this.points += points;
    }

    /**
     * Returns the details of the membership.
     * 
     * @return The details of the membership
     */
    public String getMemberDetails() {
        return "This membership card belongs to " + memberName + ". They have " + getPoints()
                + " points. Their next movie is " + nextMovie + " at " + displayShowTime() + " with a " + theatreType
                + " screening. They will be having " + snack + " as a snack. They have " + returnMembershipRank() + " membership.";
    }

    /**
     * Abstract method to return the membership rank.
     * 
     * @return The membership rank
     */
    public abstract String returnMembershipRank();

    /**
     * Abstract method to print member benefits.
     */
    public abstract void printMemberBenefits();

    /**
     * Abstract method to purchase a movie ticket.
     * 
     * @param ticketPrice The price of the movie ticket
     * @param nextMovie   The title of the next movie
     * @param theatreType The type of theatre (e.g., 3D, IMAX)
     * @param showHour    The hour of the showtime
     * @param showMinute  The minute of the showtime
     * @param snack       The preferred snack for the movie
     */
    public abstract void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack);
}
