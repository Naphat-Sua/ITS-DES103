package DES103_LAB05_FamilyMember;

public class FamilyMember {
    //Properties
    static String familyName = "Hilton";
    String firstname;
    static double commonFund = 10000.00;
    double privateFund;
    //Constructor
    public FamilyMember(String firstname, double privateFund) {
        this.firstname = firstname;
        this.privateFund = privateFund;
    }
    //Methods
    void printPrivateFund() {
        System.out.println(firstname + " " + familyName + " has $" + privateFund);
    }
    void contributeToCommonFund(double amount) {
        privateFund -= amount;
        commonFund += amount;
    }
    static void payFromCommonFund(double amount) {
        commonFund -= amount;
    }
    static void printFamilyFund() {
        System.out.println("The " + familyName + " family has $" + commonFund);
    }
}
