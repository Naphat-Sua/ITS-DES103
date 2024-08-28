package DES103_LAB03_CompanyHierarchy;

public class CEO extends Executive {
    //Properties
    String positionVehicle;
    //Constructor
    CEO(String firstName, String lastName, int day, int month, int year, String workplace, String positon, double salary, double bonus, String positionVehicle) {
        super(firstName, lastName, day, month, year, workplace, positon, salary, bonus);
        this.positionVehicle = positionVehicle;
    }
    //Method
    void printInfo() {
        super.printInfo();
        System.out.println("Position Vehicle: " + positionVehicle);
    }
    //Method 2
    void showVision(String vision) {
        System.out.println(super.name.firstName + " " + super.name.lastName);
        System.out.println(" show " + vision);
    }
}
