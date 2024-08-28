package DES103_LAB03_CompanyHierarchy;

public class Executive {
    //Properties
    double bonus;
    //Constructor
    Executive(String firstName, String lastName, int day, int month, int year, String workplace, String positon, double salary, double bonus) {
        super(firstName, lastName, day, month, year, workplace, positon, salary);
        this.bonus = bonus;
    }
    //Method
    void printInfo() {
        super.printInfo();
        System.out.println("Bonus: " + bonus);
    }
    //Method 2
    void announceRule(String rule) {
        System.out.println(super.position + super.name.firstName + " " + super.name.lastName);
        System.out.println("Announce rule: " + rule);
    }
}
