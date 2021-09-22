import java.util.List;

public class Order {
	public Person sender;
	public Courier courier;
	public List<Food> order;
	public OrderStatus status; 
	
	public Order (Person sender, Courier courier, OrderStatus status) {
		this.sender = sender;
		this.courier = courier;
		this.order = sender.order;
		this.status = status;
	}
	
	public double getPrice () {
		double sum = 0;
		for (int i = 0; i < this.order.size(); i++) {
			sum = sum + this.order.get(i).price;
		}
		return sum;
	}
	
	public void printStatus() {
		System.out.println(this.status);
	}
	
	public void changeStatus(OrderStatus newStatus) {
		this.status = newStatus;
	}
	
	
	
}
