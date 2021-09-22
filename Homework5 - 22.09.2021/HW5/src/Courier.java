
public class Courier {
	public String name;
	public String surname;
	public String telephone;
	public String vehicleType;
	
	public Courier (String name, String surname, String telephone, String vehicleType) {
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
		this.vehicleType = vehicleType;
	}
	
	public String toString() {
		return "Couriers's Name: " + this.name + ". Surname: " + this.surname + ". Phone number: " + this.telephone + ". Drives: " + this.vehicleType + ".";
	}
	
}
