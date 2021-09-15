
public class uTask26 {
	
	public static String checkOrder(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1) {
				if(arr[i] < arr[i+1]) {
					sum++;
				} else if (arr[i] > arr[i+1]) {
					sum--;
				} 				
			}
		}
		
		if (sum == arr.length - 1) {
			return "Increasing";
		} else if (sum == -(arr.length - 1)) {
			return "Decreasing";
		} else {
			return "Not increasing, not decreasing";
		}
	}

	public static void main(String[] args) {
		// Uzrakstīt metodi, kas kā parametru saņem masīvu vai sarakstu, un atgriež rezultātu, kurš
		// norāda vai visi masīva/saraksta elementi ir augošā/dilstošā/ne augošā,ne dilstošā secībā
		int[] array = {1, 2, 3};
		System.out.println(checkOrder(array));
		
		}
	}


