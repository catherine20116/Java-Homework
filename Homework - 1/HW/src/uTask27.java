
public class uTask27 {

	public static String combineStrings(String a, String b, String ...strings ) {
		
		if(strings.length == 0) {
			return a + b;
		} else if (strings.length == 2) {
			return a + b + strings[0] + strings[1];
		} else {
			return a + b + strings[0];
		}
		
	}
	
	public static void main(String[] args) {
		// Uzrakstīt metodi combineStrings, kas apvieno vairākus String objektus vienā. Paredzēt, ka
		// metodi varēs izsaukt gan ar 2, gan ar 3, gan ar 4 String objektiem.
		String a = "lala";
		String b = "lolo";
		String c = "lelel";
		String d = "lulul";
		System.out.println(combineStrings(a, b, c, d));
	}

}
