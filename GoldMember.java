import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {
    private static boolean validCredentials;
    private static final int INITIAL_POINTS = 50;

    // Constructor 1
    public GoldMember(String memberName) {
        super(memberName, 0.25, 2.0); 
        validCredentials=false; // Set validCredentials to false
    }

    // Constructor 2
    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinute, String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinute, snack, 0.25, 2.0); // Invoke 8-argument constructor of SilverMember
        validCredentials=false; // Set validCredentials to false
    }

    public String returnMembershipRank(){
        return "\nMembership status: Gold";
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
