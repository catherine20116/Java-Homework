import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class uTask24 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura no String saraksta izmet visus elementus, kuri ir vienādi ar ievadē
		// saņemto vārdu.
		
		ArrayList<String> array = new ArrayList<String>(Arrays.asList("ABC","CDE", "EFG","CDE","ANC"));
		System.out.println("The initial array is " + array);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals(word)) {
				array.remove(i);
			}
		}
		
		System.out.println("The new array is " + array);
	}

}
