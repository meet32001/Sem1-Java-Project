/**
 * MovieMembershipTest is a test class for exercising and demonstrating the
 * functionality
 * of the MovieMembership hierarchy.
 */
public class MovieMembershipTest {

    public static void main(String[] args) {
        // Create customer objects
        SilverMember mySilver = new SilverMember("Vivek", "Dil", "Standard", 19, 30, "Popcorn");
        GoldMember myGold = new GoldMember("Ajay", "King", "Standard", 18, 45, "Soda", 0.5, 1.5);
        IMAXMember myIMAX = new IMAXMember("Raj", "Hello", "IMAX", 20, 0, "Nachos");

        // Create an array of type MovieMembership
        MovieMembership[] movieMembershipArray = new MovieMembership[3];

        // Assign each customer object to an element of the array
        movieMembershipArray[0] = mySilver;
        movieMembershipArray[1] = myGold;
        movieMembershipArray[2] = myIMAX;

        // Print details of each member
        for (MovieMembership member : movieMembershipArray) {
            System.out.println("Member Name: " + member.getMemberName());
            System.out.println("Membership Rank: " + member.returnMembershipRank());
            System.out.println("Points: " + member.getPoints());
            System.out.println("Next Movie: " + member.getNextMovie());
            System.out.println("Theatre Type: " + member.getTheatreType());
            System.out.println("Snack: " + member.getSnack());
            System.out.println("Show Time: " + member.displayShowTime());
            System.out.println(member.getMemberDetails());
            member.printMemberBenefits();
            System.out.println();
        }

        // Purchase a movie ticket for each member
        for (MovieMembership purchaseDetail : movieMembershipArray) {
            purchaseDetail.purchaseMovieTicket(6.99, "Matrix 4", "standard", 11, 25, "Sour keys");
            System.out.println(purchaseDetail.getMemberDetails());
        }

        myGold.accessVIPLounge();
        System.out.println(myGold.purchaseAlcohol());
        System.out.println(myGold.getMemberDetails());

        // Additional ticket purchases for individual members
        mySilver.purchaseMovieTicket(7.89, "Suicide Squad", "Standard", 14, 25, "Smarties");
        myGold.purchaseMovieTicket(15.98, "The Big Short", "Standard", 13, 50, "Kitkat");
        myIMAX.purchaseMovieTicket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");

        // Print updated details of each member
        System.out.println();
        System.out.println(mySilver.getMemberDetails());
        System.out.println();
        System.out.println(myGold.getMemberDetails());
        System.out.println();
        System.out.println(myIMAX.getMemberDetails());
        System.out.println();
    }
}
