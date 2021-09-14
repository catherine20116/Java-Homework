import java.util.Scanner;
import java.util.Arrays;

public class uTask10 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas ievadē saņem vienu burtu un izvada paziņojumu par to vai šis burts
		//ir patskanis (согласные) ,līdzskanis (гласные), vai divskanis (о), ja netiek ievadīts burts izvadīt ķļūdas paziņojumu.
		String[] arraySogl = new String[]{"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};
		String[] arrayGlas = new String[]{"a", "e", "i", "u", "y"};
		String exception = "o";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		String a = sc.nextLine();
		sc.close();
		
		if (a.toLowerCase().equals(exception)) {
			System.out.println(a + "-> patskanis & divskanis");
		} else if (Arrays.asList(arrayGlas).contains(a.toLowerCase())) {
			System.out.println(a + "-> patskanis");
		} else if (Arrays.asList(arraySogl).contains(a.toLowerCase())) {
			System.out.println(a + "-> līdzskanis");
		} else {
			System.out.println("There is no such letter");
		}
	}

}
