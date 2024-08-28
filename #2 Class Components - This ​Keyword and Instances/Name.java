package DES103_LAB02_PeopleID;

public class Name {
    //Properties
    String firstName;
    String lastName;
    //Constructor
    Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Methods
    void printName() {
        System.out.println(firstName + " " + lastName);
    }
}

