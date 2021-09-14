import java.util.Scanner;

public class Task2 {
	
	public static int Average(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3;
	}

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura ievadē saņem 3 skaitļus un izvada skaitļu vidējo
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int x = sc.nextInt();
		System.out.println("Enter the second number");
		int y = sc.nextInt();
		System.out.println("Enter the third number");
		int z = sc.nextInt();
		sc.close();
		System.out.println("The avergae number is: " + Average(x, y, z));
		
	}

}
