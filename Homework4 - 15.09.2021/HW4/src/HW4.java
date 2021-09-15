import java.util.Random;
import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		// Nejauši izvēlās veselo skaitli N robežās no 3 līdz 6
		Random rand = new Random();
		int arrayLength = rand.nextInt(4) + 3;
		
		// Izveido 2D masīvu izmērā NxN (N rindas un N kolonnas)
		
		int[][] array = new int[arrayLength][arrayLength];
		
		// Pieprasa no lietotāja veikt izvēli:
		// A. Aizpildīt masīva elementa vērtības manuāli
		// B. Aizpildīt masīva elementa vērtības nejauši (ar skaitļiem no 1 līdz 100)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A to manually fill out the array. Type B to fill the array automatically");
		String choice = sc.nextLine();		
		
		while(!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b")) {
			System.out.println("Wrong choice. Type A to manually fill out the array. Type B to fill the array automatically");
			choice = sc.nextLine();
		}

		// * Ja lietotājs izvēlās A iespēju: lietotājs pats ievada katra masīva elementa vērtību, piemēram:
		// * Ja lietotājs izvēlās B iespēju: masīva elementi tiek aizpildīti ar gadījuma (Random) vērtībā robežās no 1 līdz 100.

		if(choice.equalsIgnoreCase("a")) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.println("Enter a number to fill the array");
					array[i][j] = sc.nextInt();
				}
			}
		} else {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					int filling = rand.nextInt(100) + 1;
					array[i][j] = filling;
				}
			}
		}

		sc.close();
		
		// Masīvs tiek izvadīts uz ekrāna tabulas veidā
		System.out.println("This is the original table");
		
		for (int[] row : array) {
			for (int i : row) {
				System.out.print(i);
	            System.out.print("\t");
			}
			System.out.println();
		}
		
		// 6.) Masīvs tiek pārvērsts par diagonāles matricu - visas elementu vērtības, izņemot galvenās diagonāles vērtības, 
		// tiek pārvērstas par 0.
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i != j) {
					array[i][j] = 0;
				}
			}
		}
		
		// Masīvs tiek izvadīts uz ekrāna tabulas veidā
		System.out.println("This is the formatted table");
		for (int[] row : array) {
			for (int i : row) {
				System.out.print(i);
	            System.out.print("\t");
			}
			System.out.println();
		}
		
		

	}

}
