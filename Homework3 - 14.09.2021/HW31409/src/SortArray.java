import java.util.Scanner;
import java.util.Random;


public class SortArray {

	public static void main(String[] args) {
		// ** Uzdevumu izpildīšanai neizmantojiet Arrays klases iebūvētās metodes masīva elementu kārtošanai !
		// Uzrakstīt programmu klasē "SortArray", kas aicina lietotāju ievadīt masīva izmēru robežās no 20 līdz 40 (incl)++
		// 1) Programma izveido int masīvu ar izmēru, ko saņēma no lietotāja ++
		// 2) Masīvs tiek aizpildīts ar gadījuma skaitļiem(int) robežās no 10 līdz 99 (incl) +
		// 3) Izvadam uz ekrāna visus masīvā esošos skaitļus atdalītus ar komatu un atstarpi (, un whitespace)
		// 4) Veicam masīvā esošo elementu kārtošanu augošā secībā (neveidojam jaunu masīvu, bet pārkārtojam esošo) (for low to high, not new, 
		//but changing existing)
		// 5) Izvadam uz ekrāna sakārtotos masīva elementus

		// Massive Length
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 20 and 40");
		int MassivLength = sc.nextInt();
		
		while (MassivLength < 20 || MassivLength > 40) {
			System.out.println("Wrong length, try again");
			MassivLength = sc.nextInt();
		}
		
		sc.close();
		
		int[] array = new int[MassivLength];
		
		// filling massive
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			int index = rand.nextInt(90) + 10;
			array[i] = index;
		}
		
		// display initial massive
		System.out.println("Below is the initial array: ");
		for (int j = 0; j < array.length; j++) {
			if (j == array.length - 1) {
				System.out.print(array[j]);
			} else {
				System.out.print(array[j] + ", ");
			}	
		}
				
		// sort from low to high
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if(array[i] > array[j]) {
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				}
			}

		}
		
		System.out.println();
		// display sorted massive
		System.out.println("Below is the sorted array: ");
		for (int j = 0; j < array.length; j++) {
			if (j == array.length - 1) {
				System.out.print(array[j]);
			} else {
				System.out.print(array[j] + ", ");
			}	
		}
				
	}

}
