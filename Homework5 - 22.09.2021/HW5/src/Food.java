
public class Food {
	public String name;
	public String type;
	public double price;
	
	public Food(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String toString() {
		return "Dish Name: " + this.name + ". Type: " + this.type + ". Price: " + this.price + ".";
	}
}
