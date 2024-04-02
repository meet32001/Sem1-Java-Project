import java.util.Scanner;

/**
 * GoldMember represents a Gold level movie membership, extending SilverMember and implementing VIPPrivilege.
 */
public class GoldMember extends SilverMember implements VIPPrivilege {

    // Member variables
    private static boolean validCredentials;

    // Constructor 1
    public GoldMember(String memberName) {
        super(memberName, 0.25, 2.0); // Initialize with default discount and points rates
        validCredentials = false; // Set validCredentials to false
        setPoints(50); 
    }

    // Constructor 2
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute,
                      String snack, double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack, 0.25, 2.0);
        validCredentials = false; // Set validCredentials to false
        setPoints(50); // Initialize points
    }

    /**
     * Returns the membership rank of the Gold member.
     * @return The membership rank
     */
    @Override
    public String returnMembershipRank() {
        return "Gold";
    }

    /**
     * Overrides the method to return member details.
     * @return Details of the Gold membership
     */
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails();
    }

    /**
     * Allows access to the VIP lounge.
     */
    @Override
    public void accessVIPLounge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        if (sc.nextInt() == PASSWORD) {
            validCredentials = true;
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
    }

    /**
     * Purchases alcohol for Gold members if valid credentials are provided.
     * @return A message indicating if the purchase was successful
     */
    @Override
    public String purchaseAlcohol() {
        if (validCredentials) {
            setSnack("alcohol");
            return "Enjoy your beverage";
        }
        return "Beverage cannot be purchased because no valid password has been entered";
    }
}
