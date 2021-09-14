import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kura ievadē saņem divus teksta gabalus un izvada tos komibnētā formā:
		// Īsākais+garākais+īsākais, ja abi teksta gabali ir vienādā garuma, pieņemt, ka pirmais ir garākais.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word");
		String str1 = sc.nextLine();
		System.out.println("Enter the second word");
		String str2 = sc.nextLine();
		sc.close();
		
		
		if(str1.length() > str2.length()) {
			System.out.println(str2 + str1 + str2);
		} else if (str1.length() < str2.length()) {
			System.out.println(str1 + str2 + str1);
		} else {
			System.out.println(str2 + str1 + str2);
		}
		
		
	}

}
