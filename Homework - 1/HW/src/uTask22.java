import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class uTask22 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura veic sarakstu kopēšanu no viena saraksta uz otru sarakstu, ja kāda
		// elementa garums pirmajā sarakstā ir 4, tad otrajā sarakstā pirms šīs vērtības jāparādās jaunai
		// vērtībai, kura sastāv no četrām zvaigznītēm (“****”)
		
		String[] originalArray = {"this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"};
		
		
		List<String> resultList = new ArrayList<String>();
	    Collections.addAll(resultList, originalArray);
	    System.out.println("The original array:");
	    System.out.println(resultList);
	    
		ArrayList <Integer> index = new ArrayList <Integer>();

			for (int i = 0; i < originalArray.length; i++) {
				if(originalArray[i].length() == 4) {
					index.add(i);
				}
			}
		
		for (int i = 0; i < index.size(); i++) {
			if(index.get(i) == 0) {
				resultList.add(index.get(i), "****");
			} else {
				resultList.add(index.get(i) + i, "****");
			}
			
		}


		System.out.println("The modified array:");
	    System.out.println(resultList);
	}

}
