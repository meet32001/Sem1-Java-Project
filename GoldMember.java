import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {
    private static boolean validCredentials;
    private static final int INITIAL_POINTS = 50;

    // Constructor 1
    public GoldMember(String memberName) {
        super(memberName, 0.25, 2.0);
        validCredentials = false; // Set validCredentials to false
    }

    // Constructor 2
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute,
            String snack, double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack, 0.25, 2.0);
        validCredentials = false; // Set validCredentials to false
        setpoint(INITIAL_POINTS);
    }

    public String returnMembershipRank() {
        return "Gold Membership.";
    }

    // Override discount rate method from VIPPrivilege interface
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails();
    }

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

    @Override
    public String purchaseAlcohol() {
        if (validCredentials) {
            setSnack("alcohol");
            return "Enjoy your beverage";
        }
        return "Beverage cannot be purchased because no valid password has been entered";
    }
}
