import java.util.List;
import java.util.ArrayList;


public class Person {
	public String name;
	public String surname;
	public String telephone;
	public List<Food> order;
	
	public Person (String name, String surname, String telephone) {
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
		this.order = new ArrayList<Food>();
	}
	
	public void addFood(Food name) {
		this.order.add(name);
	}
	
	public String toString() {
		return "Client's Name: " + this.name + ". Surname: " + this.surname + ". Phone number: " + this.telephone + ".";
	}

}
