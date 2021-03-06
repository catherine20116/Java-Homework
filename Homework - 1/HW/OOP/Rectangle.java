
public class Rectangle extends Shape {
	int length;
	int width;
	String kvadrats;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
		this.kvadrats = isSquare();
	}
	
	public Rectangle(int length) {
		this.length = length;
		this.width = length;
		this.kvadrats = isSquare();
	}
	
	public String isSquare() {
		return "Is Not Square";
	}
	
	public int area() {
		return this.length * this.width;
	}
	
	public int perimeter() {
		return (this.length + this.width)*2;
	}
	
	public String toString() {
		return "This form " + isSquare() + " with length " + this.length + " and with width " + this.width + ". It's area equals to " + area() + " and it's perimeter equals to " + perimeter() + "."; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle one = new Rectangle (5, 4);
		System.out.println(one);
		Rectangle two = new Rectangle (3, 8);
		System.out.println(two);
		Square three = new Square(6);
		System.out.println(three);
		three.setColor("Blue");
		System.out.println(three.getColor());
	}

}
