

public class Square extends Rectangle {
	
	public Square(int length) {
		super(length);
	}
	
	public String isSquare() {
		return "Is Square";
	}
	
	public String toString() {
		return "This form " + isSquare() + " with sides equal to " + this.length + ". It's area equals to " + area() + " and it's perimeter equals to " + perimeter() + "."; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
