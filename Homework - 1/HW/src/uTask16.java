import java.util.Arrays;

public class uTask16 {
	
	public static void main(String[] args) {
		// Uzrakstīt programmu, kas int masīvā, visus elementus kas ir vienādi ar 0, pārvieto uz masīva
		//beigām.
		int[] array = {0, 4, 0, 7, 8, 9, 0, 1};		
		
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == 0 && array[i + 1] != 0) {
				int temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			} else if (array[i] == 0 && array[i + 1] == 0) {
				int q = i;
				while (q < array.length) {
					if(array[q] != 0) {
						array[i] = array[q];
						array[q] = 0;
						break;
					}
				q++;
					
				}
			}
				
		
		}
		System.out.println(Arrays.toString(array));
	
	}
}
