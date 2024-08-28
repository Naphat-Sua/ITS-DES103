package DES103_LAB03_CompanyHierarchy;

public class Employee extends Person {
    //Properties
    String workplace;
    String position;
    double salary;
    //Constructor
    Employee(String workplace, String position, double salary) {
        super(firstName, lastName, day, month, year);
        this.workplace = workplace;
        this.position = position;
        this.salary = salary;
    }
    //Method
    void printInfo() {
        super.printInfo();
        System.out.println("Workplace: " + workplace);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
    //Method 2
    void followRule(String rule) {
        System.out.println("Position: " + super.name.firstName + " " + super.name.lastName);
        System.out.println("Announce rule: " + rule);
    }
}
