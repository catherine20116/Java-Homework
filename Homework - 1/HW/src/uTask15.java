import java.util.Arrays;

public class uTask15 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas visus int masīva, elementus kāpina 3. pakāpē.
		
		int[] array = {1, 3, 5, 6, 7};
		for (int i = 0; i < array.length; i++) {
			array[i] *= array[i] * array[i];
			
		}
		
		System.out.println(Arrays.toString(array));
	}

}
