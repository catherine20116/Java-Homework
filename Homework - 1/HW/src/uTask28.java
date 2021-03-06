import java.util.Arrays;

public class uTask28 {
	
	public static int[] reverseArray (int[] array) {
			for (int i = 0; i < array.length / 2; i++) {
				int temp = array[i];
				array[i] = array[array.length - i - 1];
				array[array.length - i - 1] = temp;
			}
			return array;
	}
	
	public static String[] reverseArray (String[] array1) {
		for (int i = 0; i < array1.length / 2; i++) {
			String temp = array1[i];
			array1[i] = array1[array1.length - 1 - i];
			array1[array1.length - 1 - i] = temp;
		}
		return array1;
}

	public static void main(String[] args) {
		// Uzrakstīt metodi, reverseArray, kura parametrā saņem masīvu un rezultātā atgriež masīvu
		// apgrieztu otrādāk. reverseArray jāstrādā gan ar String, gan int masīviem.
		
		int[] array = {1, 3, 5, 2};
		String[] array1 = {"AB","CDE","FEG"};		
		System.out.println(Arrays.toString(reverseArray(array)));
		System.out.println(Arrays.toString(reverseArray(array1)));
	}

}
