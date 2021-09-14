
import java.util.Arrays;
import java.util.Random;

public class uTask20 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, которая создает список со свободными String value и переделывает значения так 
		// чтобы они состояли только из больших букв, если меньше или равно 2 символа, мы не модифицируем
		//kura izveido sarakstu ar patvaļīgām String vērtībām un pārveido
		//vērtības tā, lai tās sastāvētu tikai no lielajiem burtiem, vērtības, kuru garums nepārsniedz 2
		//simbolus mēs nemodificējam.
		
		String[] charArray = new String[] {"A", "a", "B", "b", "C", "c", "D", "d", "E", "e", "F", "f", "G", "g", "H", "h",
				"I", "i", "J", "j", "K", "k", "L", "l", "M", "m", "N", "n", "O", "o", "P", "p", "Q", "q", "R", "r", "S", "s", 
				"T", "t", "U", "u", "V", "v", "W", "w", "X", "x", "Y", "y", "Z", "z"};
		
		Random rand = new Random();
		int array_index = rand.nextInt(3)+1;
		int char_index = rand.nextInt(52);
		
		String[] mainArray = new String[array_index];
		/*
		for (int i=0; i < mainArray.length;)
		System.out.println(charArray.length); 
		*/
		
		String[] arr = {"aDs","add","dd","eee"};
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 2) {
				arr[i] = arr[i].toUpperCase();
			} else {
				arr[i] = arr[i].toLowerCase();
			}
		}

		System.out.println(Arrays.toString(arr));
		
		
	}
}
