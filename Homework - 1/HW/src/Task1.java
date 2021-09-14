import java.util.Scanner;


public class Task1 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura saņem ievadē divus veselus skaitļus un izvada skaitļu summu.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the second number");
		int y = sc.nextInt();
		sc.close();
		System.out.println("The sum of the entered numbers is: " + (x + y));
	}

}
