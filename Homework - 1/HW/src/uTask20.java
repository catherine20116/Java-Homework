
import java.util.Arrays;
import java.util.Random;

public class uTask20 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, которая создает список со свободными String value и переделывает значения так 
		// чтобы они состояли только из больших букв, если меньше или равно 2 символа, мы не модифицируем
		//kura izveido sarakstu ar patvaļīgām String vērtībām un pārveido
		//vērtības tā, lai tās sastāvētu tikai no lielajiem burtiem, vērtības, kuru garums nepārsniedz 2
		//simbolus mēs nemodificējam.
		
		char[] charArray = new char[] {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h',
				'I', 'i', 'J', 'j', 'K', 'k', 'L', 'l', 'M', 'm', 'N', 'n', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', 'r', 'S', 's', 
				'T', 't', 'U', 'u', 'V', 'v', 'W', 'w', 'X', 'x', 'Y', 'y', 'Z', 'z'};
		
		Random rand = new Random();
		
		
		
		String[] mainArray = new String[4];
		
		for (int i = 0; i < mainArray.length; i++) {
			int array_index = rand.nextInt(3)+1;
			char[] newArray = new char[array_index];
			for (int j = 0; j < newArray.length; j++) {
				int char_index = rand.nextInt(52);
				newArray[j] = charArray[char_index];
			}
			mainArray[i] = new String(newArray);
		}
		
		System.out.println("The original array is:");
		System.out.println(Arrays.toString(mainArray));

				
		for (int i = 0; i < mainArray.length; i++) {
			if (mainArray[i].length() > 2) {
				mainArray[i] = mainArray[i].toUpperCase();
			} else {
				mainArray[i] = mainArray[i].toLowerCase();
			}
		}
		
		System.out.println("The converted array is:");
		System.out.println(Arrays.toString(mainArray));
		
		
	}
}
