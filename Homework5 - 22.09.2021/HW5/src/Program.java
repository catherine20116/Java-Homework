
public class Program {

	public static void main(String[] args) {
		Person firstClient = new Person ("Andy", "Anderson", "+371 03205229");
		//System.out.println(firstClient);
		Courier firstCourier = new Courier ("Lui", "Anderson", "+371 05896341", "Byke");
		//System.out.println(firstCourier);
		Food pasta = new Food("pasta", "main", 5.00);
		Food stroganof = new Food("beef stroganof", "main", 10.00);
		Food caesar = new Food("caesar", "salad", 7.00);
		Food iceCream = new Food("ice cream", "dessert", 3.00);
		//System.out.println(pasta);
		firstClient.addFood(iceCream);
		firstClient.addFood(stroganof);
		firstClient.addFood(caesar);
		System.out.println(firstClient.order);
		Order order1 = new Order(firstClient, firstCourier, OrderStatus.SEEN);
		System.out.println("Total price is " + order1.getPrice());
		order1.changeStatus(OrderStatus.PREPARING);
		order1.printStatus();
		
	}

}
