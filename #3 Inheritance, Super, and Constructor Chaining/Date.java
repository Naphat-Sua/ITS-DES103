package DES103_LAB03_CompanyHierarchy;

public class Date {
    //Properties
    int day; 
    int month; 
    int year;
    //Constructor
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    //Methods
    void printDate() {
        System.out.println(day+"-"+month+"-"+year);
    }
}