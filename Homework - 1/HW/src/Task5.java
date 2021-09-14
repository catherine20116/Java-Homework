import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura ievadē saņem skaitli x un pārbauda vai skaitlis ir robežās [50(incl)..100 (excl))
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		sc.close();
		if (x >= 50 && x < 100) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
