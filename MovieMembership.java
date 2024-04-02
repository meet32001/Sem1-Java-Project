/**
 * MovieMembership
 */
public abstract class MovieMembership {

    private String memberName, nextMovie, theatreType, snack;
    private int showHour, showMinutes, points;

    MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unknown";
        this.theatreType = "";
        this.showHour = 0;
        this.showMinutes = 0;
        this.snack = "unknown";
        this.points = 0;
    }

    MovieMembership(String memberName, String nextMovie, String theatreType, int showHour, int showMinute,String snack) {
        this.memberName = memberName;
        this.nextMovie = nextMovie;
        this.theatreType = theatreType;
        this.showHour = showHour;
        this.showMinutes = showMinute;
        this.snack = snack;
    }

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

    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public void setpoint(int points) {
        this.points = points;
    }

    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

    public void setShowtime(int hour, int minute) {
        this.showHour = hour;
        this.showMinutes = minute;
    }

    public String displayShowTime() {
        return this.showHour + ": " + this.showMinutes;
    }

    public void addPoints(int points) {
        this.points = this.points + points;
    }

    public String getMemberDetails() {
        return "This membership card belongs to "+ memberName + ". They have "+ points+" points. Their next movie is "+ nextMovie +" at "+ displayShowTime()+ " with a "+theatreType+" screening. They will be having "+snack+" as a snack. They have ";
    }
    

    public abstract String returnMembershipRank();

    {

    }

    public abstract void printMemberBenefits();

    {

    }

    public abstract void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack);

    {
    }
}