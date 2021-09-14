
import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		// 1) Aicina lietoāju ievadīt kādu vārdu un uzvārdu vienā rindā ar atstarpi ++
		// 2) Sadala vārdu un uzvārdu divos mainīgajos.
	    // 3) Vārdu pārveido tā, lai tas sāktos ar lielo burtu un visi pārējie būtu mazie burti (Piemēram, "Kristaps")
	    // 4) Uzvārdu pārveido, lai tas viss sastāvētu no lielajiem burtiem (Piemēram, "KRŪMIŅŠ")
	    // 5) Izvada uz ekrāna pārveidoto vārdu un uzvārdu, katru savā rindiņā ievietotu single
	        //quote pēdiņās(')

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name and Surname with a whitespace between");
		String nameSurname = sc.nextLine();
		nameSurname = nameSurname.trim();
		String[] nameSurnameArray = nameSurname.split(" ");
		
		while(!nameSurname.contains(" ") || nameSurnameArray.length < 2) {
			System.out.println("No whitespace between, enter again");
			nameSurname = sc.nextLine();
			nameSurname = nameSurname.trim();
			nameSurnameArray = nameSurname.split(" ");
		}
		sc.close();
		
		// name cap
		String name = nameSurnameArray[0];
        String firstLetStr = name.substring(0, 1);
        String remLetStr = name.substring(1);
        firstLetStr = firstLetStr.toUpperCase();
        String firstLetterCapitalizedName = firstLetStr + remLetStr;
        nameSurnameArray[0] = firstLetterCapitalizedName;
        
        // last name cap all
        for (int i = 1; i < nameSurnameArray.length; i++) {
        	nameSurnameArray[i] = nameSurnameArray[i].toUpperCase();
        }
        
		for (int i = 0; i < nameSurnameArray.length; i++) {
			if (nameSurnameArray[i].isEmpty()) {
				continue;
			}
			if (i == 0) {
				System.out.println("'"+nameSurnameArray[i]+"'");
			} else {
				System.out.print("'"+nameSurnameArray[i]+"'");
			}
		}
		
		
	}

}
