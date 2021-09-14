import java.util.Arrays;
import java.util.Random;

public class uTask21 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura izveido divus Integer sarakstus ar patvaļīgām vērtībām. Apvieno
		// sarakstus vienā jaunā sarakstā, kāpinot visus elementus 3. pakāpē.
		// которая создает 2 списка integeres со свободными значениями. Соединить списки в один список , возведя все елементы в 3. степень 
		Random rand = new Random();
		int randLOne = rand.nextInt(10);
		int randLTwo = rand.nextInt(10);
		
		int[] firstArray = new int[randLOne]; 
		int[] secondArray = new int[randLTwo];
		
		for (int i = 0; i < firstArray.length; i++) {
			int randfilling = rand.nextInt(10) + 1;
			firstArray[i] = randfilling;
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			int randfilling = rand.nextInt(10) + 1;
			secondArray[i] = randfilling;
		}
		
		System.out.println("The first array is " + Arrays.toString(firstArray));
		System.out.println("The second array is " + Arrays.toString(secondArray));
		
		int fal = firstArray.length;
		int sal = secondArray.length;
		int[] result = new int[fal + sal];
		System.arraycopy(firstArray, 0, result, 0, fal);  
		System.arraycopy(secondArray, 0, result, fal, sal);  
		System.out.println("The merged array is " + Arrays.toString(result));
		for (int i = 0; i < result.length; i++) {
			result[i] = result[i] * result[i] * result[i];
		}
		System.out.println("The merged array to the thrid pow is " + Arrays.toString(result));
	}

}
