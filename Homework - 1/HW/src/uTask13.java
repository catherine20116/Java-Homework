
public class uTask13 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas izvada visus pozitīvos divu ciparu skaitļus un to ciparu summas.
		
		for (int i = 10; i < 100; i++) {
			String numString = Integer.toString(i);
			char num1 = numString.charAt(0);
			char num2 = numString.charAt(1);
			System.out.print(i + ", ");
			System.out.print(num1 + " + "+ num2 + " = " + (Character.getNumericValue(num1) + Character.getNumericValue(num2)));
			System.out.println();
		}
	}

}
