/**
 * Program Name: Meet Shah
 * Programming date: 1st April
 */

 /**
 * VIPPrivilege is an interface defining privileges for VIP members.
 */
public interface VIPPrivilege {

     // Constant representing the password for accessing VIP privileges
     public final int PASSWORD = 2456;
 
     /**
      * Allows access to the VIP lounge.
      */
     public void accessVIPLounge();
 
     /**
      * Purchases alcohol for VIP members.
      * @return A string representing the purchased alcohol
      */
     public String purchaseAlcohol();
 }
 