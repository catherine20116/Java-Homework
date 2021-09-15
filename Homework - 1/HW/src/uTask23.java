import java.util.ArrayList;
import java.util.Arrays;

public class uTask23 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura veic sarakstu kopēšanu, otrajā sarakstā kopējot tikai pirmā
		// saraksta unikālos elementus.
		ArrayList <Integer> array = new ArrayList<Integer>(Arrays.asList(1,5,4,2,3,1,5,2,3,1));
		ArrayList <Integer> arrayNew = new ArrayList<Integer>();
		

		for (int item : array) {
			if(!arrayNew.contains(item)) {
				arrayNew.add(item);
			}
		}

		System.out.println("The initial array is:");
		System.out.println(array);
		System.out.println("The new array without duplicates is:");
		System.out.println(arrayNew);
	}

}
