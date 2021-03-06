import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uTask29 {
	
	public static ArrayList<Integer> findIndexes(List<Integer> arr){
		ArrayList <Integer> indexesArray = new ArrayList <Integer>();
		ArrayList <Integer> lengthOfZeros = new ArrayList <Integer>();
		ArrayList <Integer> twoIndexes = new ArrayList <Integer>();
		
		int length = arr.size();
		
		for (int i = 0; i < length; i++) {
			if(arr.get(i) != 0) {
				indexesArray.add(i);
			}
		}
		
		int length2 = indexesArray.size();
		
		int firstIndex = 0;
		int secondIndex = 0;
		
		if (length2 <= 0) {
			firstIndex = 0;
			secondIndex = arr.size() - 1;
		} else {
			for (int i = 0; i <= length2; i++) {
				if(i == 0) {
					lengthOfZeros.add(indexesArray.get(i));
				} else if (i == length2) {
					lengthOfZeros.add(length - indexesArray.get(i-1) - 1);
				} else {
					lengthOfZeros.add(indexesArray.get(i) - indexesArray.get(i-1) - 1);
				}
			}
			
			//System.out.println(lengthOfZeros);
			
			int mainIndex = lengthOfZeros.get(0);
			
			for (int i = 1; i < lengthOfZeros.size(); i++) {
				if(lengthOfZeros.get(i) > mainIndex) {
						mainIndex = lengthOfZeros.get(i);
				}
			}
			
			//System.out.println(mainIndex);
			
			int index = lengthOfZeros.indexOf(mainIndex);
			
			//System.out.println(index);
			
			int missedInts = lengthOfZeros.size() - 1;
			
			//System.out.println(missedInts);
			
			if (index == missedInts) {
				secondIndex = arr.size() - 1;
				firstIndex = secondIndex - mainIndex + 1;
			} else if (index == 0) {
				firstIndex = 0;
				secondIndex = firstIndex + mainIndex;
			} else {
				firstIndex = lengthOfZeros.get(index - 1) + 1;
				secondIndex = firstIndex + mainIndex - 1;
			}
			
		}
		
		twoIndexes.add(firstIndex);
		twoIndexes.add(secondIndex);
		
		return twoIndexes;
	}

	public static void main(String[] args) {
		// Uzrakstīt metodi, kas kā parametru saņem veselu skaitļu masīvu vai sarakstu, un kā rezultātu
		// atgriež divus indeksus, kuri apraksta garāko secīgo nuļļu nogriežna sākumu un beigas.
		// Ja sarakstā/masīvā eksistē vairākas vienāda garuma nogriežņi ar elementu 0 der jebkurš no
		// nogriežņiem.
		
		// Напишите метод, который как параметр получает масив или список целых чисел, и как результат возвращает 2 индекса:
		//1 индекс это индекс 0 из самого длинного места с нулями
		// 2 индекс это индекс окончания самого длинного места с нулями
		
		List <Integer> arr1 = Arrays.asList(0, 0, 0, 0);
		List <Integer> arr2 = Arrays.asList(0, 0, 1, 0, 0, 0);
		List <Integer> arr3 = Arrays.asList(0, 0, 0, 3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0);

		System.out.println(findIndexes(arr1));
		System.out.println(findIndexes(arr2));
		System.out.println(findIndexes(arr3));
		
	}

}
