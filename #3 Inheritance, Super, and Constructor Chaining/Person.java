package DES103_LAB03_CompanyHierarchy;

public class Person {
    //Properties
    Name name;
    Date dateOfBirth;
    static int numPerson=0;
    //Constructor
    Person(String firstName, String lastName, int day, int month, int year) {
        this.name = new Name(firstName, lastName);
        this.dateOfBirth = new Date(day, month, year);
        numPerson = numPerson + 1;
    }
    //Method
    void printInfo() {
        System.out.println("Name: " + name.firstName + " " + name.lastName);
        System.out.println("DOB: " + dateOfBirth.day + "-" + dateOfBirth.month + "-" + dateOfBirth.year);
        printAgeAtYear(dateOfBirth.year);
    }
    //Method 2
    void printAgeAtYear(int year) {
        System.out.println("Age: " + (2023-dateOfBirth.year));
    }
    //Method 3
    void printNumberOfPerson() {
        System.out.println("The total number of Persons is " + numPerson);
    }
}
