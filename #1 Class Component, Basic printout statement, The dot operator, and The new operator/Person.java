
public class Person {

	//Properties
	String name;
	String surname;
	String sex;
	String occupation;
	String organization;
	
	//Construction
	Person(String name,String surname, String sex, String occupation, String organization) {
		this.name = name;
		this.surname = surname;
		this.sex = sex;
		this.occupation = occupation;
		this.organization = organization;
	}
	
	//Method
	void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("Surname : " + surname);
		System.out.println("Sex : " + sex);
		System.out.println("Occupation : " + occupation);
		System.out.println("Organization : " + organization);
	}
}
