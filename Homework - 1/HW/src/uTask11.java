import java.util.Scanner;

public class uTask11 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas ievadē saņem skaitli(int) un izvada šī skaitļa reizināšanas tabulu līdz
		// ievadītajam skaitlim, ieskaitot		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		sc.close();
		for (int i = 0; i <= x; i++) {
			System.out.println(x + " X " + i + " = " + x*i);
		}
		
		
	}

}
