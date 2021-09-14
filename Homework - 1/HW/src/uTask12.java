import java.util.Scanner;
import java.util.Random;

public class uTask12 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas izvēlas random skaitli robežās no 1 līdz 10 (incl), un prasa
		//lietotājam uzminēt šo skaitli, lietotājam jāmin skaitlis, kamēr tas tiek uzminēts, kad tas notiek
		//izvadīt paziņojumu.
		Random rand = new Random();
		int int_random = rand.nextInt(10) + 1;
		System.out.println(int_random);
		System.out.println("I have chosen number between 1 and 10, try to guess it.");
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt();
		while (x != int_random) {
			System.out.println("Nop, try again.");
			x = sc.nextInt();
		}
			System.out.println("Correct, the number was " + int_random);
			sc.close();
				
	}

}
