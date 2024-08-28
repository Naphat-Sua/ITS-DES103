
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle box1 = new Rectangle();
		
		//Print the basic information
	    System.out.println(box1.width);
	    System.out.println(box1.length);
	    
	    //Import perimeter
	    double PerimeterBox1 = box1.findPerimeter();
	    System.out.println("The Perimeter of box1 is "+ PerimeterBox1);
	    
	    //Import Diagonal
	    double DiagonalBox1 = box1.findDiagonal();
	    System.out.println("The Diagonal of box1 is "+ DiagonalBox1);
	    
	    //Check for a square box
	    boolean isBox1 = box1.isSquare();
		if (isBox1 == true) {
			System.out.println("It is a square box.");
		}	
		else {
			System.out.println("It is not a square box.");
		}
		
		//Create new 1 but not 1 Unit square
		Rectangle box2 = new Rectangle(2,3);
		
		//Print the basic information
	    System.out.println(box2.width);
	    System.out.println(box2.length);
	    
	    //Import perimeter
	    double PerimeterBox2 = box2.findPerimeter();
	    System.out.println("The Perimeter of box2 is "+ PerimeterBox2);
	    
	    //Import Diagonal
	    double DiagonalBox2 = box2.findDiagonal();
	    System.out.println("The Diagonal of box2 is "+ DiagonalBox2);
	    
	    //Check for a square box
	    boolean isBox2 = box2.isSquare();
		if (isBox2 == true) {
			System.out.println("It is a square box.");
		}	
		else {
			System.out.println("It is not a square box.");
		}
		
	}
}
