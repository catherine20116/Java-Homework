import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas ievadē saņem divus skaitļus(int) un izvada visus naturālus skaitļus, no
		//mazākā līdz lielākajam skaitlim ieskaitot, kas vienlaikus dalās ar 2 un 3, bet ne ar 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range number");
		int x = sc.nextInt();
		System.out.println("Enter the ending range number");
		int y = sc.nextInt();
		sc.close();
		
		if (x < 1) {
			x = 1;
		}
		
		if (y < 1) {
			Math.abs(y);
		}
		
		for (int i = x; i <= y; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i%5 != 0) {
				System.out.print(i + " ");
			}
		}
		
	}

}
