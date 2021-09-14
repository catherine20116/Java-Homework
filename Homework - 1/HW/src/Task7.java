import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas ievadē saņem skaitli(int) un izvada visus naturālus skaitļus līdz šim skaitlim, 
		//ieskaitot.
		//Papilduzdevums: uzlabot tā lai, ja tiek ievadīts negatīvs skaitlis, lai tiktu izvadīti visi negatīvi veseli
		//skaitļi līdz nullei
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		sc.close();
		
		if (x > 0) {
			for (int i = 0; i <= x; i++) {
				if (i == x) {
					System.out.print(i);
				} else {
					System.out.print(i + ",");
				}
			}
		} else if (x < 0) {
			for (int i = x; i <= 0; i++) {
				if (i == 0) {
					System.out.print(i);
				} else {
					System.out.print(i + ",");
				}
			}
		} else {
			System.out.print(0);
		}
		
	}

}
