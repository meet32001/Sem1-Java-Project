import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {
    private static boolean validCredentials;
    private static final double DISCOUNT_RATE = 0.25;
    private static final double POINTS_RATE = 2.0;
    private static final int INITIAL_POINTS = 50;

    // Constructor 1
    public GoldMember(String memberName, double discountRate, double pointsRate) {
        super(memberName, discountRate, pointsRate); 
        validCredentials=false; // Set validCredentials to false
    }

    // Constructor 2
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack, double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack, discountRate, pointsRate); // Invoke 8-argument constructor of SilverMember
        validCredentials=false; // Set validCredentials to false
    }

    public String returnMembershipRank(){
        return "Gold";
    }
    // Override discount rate method from VIPPrivilege interface
    @Override
    public String getMemberDetails() {
        return super.getMemberDetails() + " " +returnMembershipRank() ;
    }

    @Override
    public void accessVIPLounge() {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the password");
       if(sc.nextInt() == PASSWORD){
        validCredentials=true;
        System.out.println("Access granted!");
       }
    }

    @Override
    public String purchaseAlcohol() {
        if(validCredentials==true)
        {
            setSnack("alcohol");
            return "Enjoy your beverage";
        }
        return "Beverage cannot be purchased because no valid password has been entered";
    }
}
