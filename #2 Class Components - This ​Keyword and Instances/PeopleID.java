package DES103_LAB02_PeopleID;

public class PeopleID {
    //Properties
    Name name;
    String ID;
    Date dateOfBirth;
    Address address;
    //Constructor
    PeopleID(Name name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    //Constructor 2
    PeopleID(Name name, String ID, Date dateOfBirth, Address address) {
        this(name, ID);
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    //Methods
    void printPeopleID() {
        name.printName();
        System.out.println(ID);
        dateOfBirth.printDate();
        address.printFullAddress();
    }
}