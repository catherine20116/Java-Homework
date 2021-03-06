import java.util.Scanner;

public class uTask25 {
	
	public static boolean checkLength(String pass) {
		if (pass.length() < 10) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean checkInside(String pass) {
		int sum = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLetter(pass.charAt(i)) || Character.isDigit(pass.charAt(i))) {
				sum+=1;
			} 
		}
		if(sum == pass.length()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkIntNum(String pass) {
		int sum = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i))) {
				sum+=1;
			} 
		}
		if(sum >= 2 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// Uzrakstīt programmu, kura pārbauda vai parametrā saņemtā parole ir droša vai nē.
		// Droša parole sastāv no:
			// ▪ Vismaz 10 simboliem
			// ▪ Tikai no burtiem un cipariem
			// ▪ Satur vismaz 2 ciparus

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String password = sc.nextLine();
		sc.close();
		
		if(checkLength(password) && checkInside(password) && checkIntNum(password)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
