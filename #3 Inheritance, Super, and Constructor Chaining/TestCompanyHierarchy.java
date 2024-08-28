package DES103_LAB03_CompanyHierarchy;

public class TestCompanyHierarchy {
    public static void main(String[]args){
        System.out.println("### FUTURETECH COMPANY INFORMATION ###");
        //Visitor
        System.out.println(">> Visitor information");
        Person person01 = new Person("Somyai", "Yodyium", 15, 4, 1987);
        Person person02 = new Person("Pitak", "Raksa", 1, 8, 1980);
        //PrintInfo
        person01.printInfo();
        System.out.println("--------------------------------------------");
        person02.printInfo();
        System.out.println("--------------------------------------------");

        //Employee
        System.out.println(">> Employee information");
        Employee employee01 = new Employee("FutureTech", "Manager", 500000);
        Employee employee02 = new Employee("FutureTech", "Manager", 500000);
        //PrintInfo
        employee01.printInfo();
        System.out.println("--------------------------------------------");
        employee02.printInfo();
        System.out.println("--------------------------------------------");

        //Executive
        System.out.println(">> Executive information");
        Executive executive01 = new Executive("FutureTech", "CEO", 1000000);
        Executive executive02 = new Executive("FutureTech", "CEO", 1000000);
        //PrintInfo
        executive01.printInfo();
        System.out.println("--------------------------------------------");
        executive02.printInfo();
        System.out.println("--------------------------------------------");

        //Rule
        System.out.println(">> Rule Announcement");
        executive01.announceRule("No nap during working hours");
        System.out.println("--------------------------------------------");

        //Rule follower
        employee01.followRule("No nap during working hours");
        employee02.followRule("No nap during working hours");
        System.out.println("--------------------------------------------");

        //CEO
        System.out.println(">> CEO information");
        CEO ceo01 = new CEO("FutureTech", "CEO", 1000000, "BMW");
        ceo01.printInfo();
        System.out.println("--------------------------------------------");

        //CEO Vision
        System.out.println(">> CEO Vision");
        ceo01.showVision("becoming ISO standard");
        System.out.println("--------------------------------------------");

        //Number of person
        System.out.println(">> Number of person");
        person01.printNumberOfPerson();
    }
}
