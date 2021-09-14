import java.util.Arrays;

public class uTask14 {

	public static void main(String[] args) {
		//Uzrakstīt programmu, kas String masīvu, kurā glabājas veselu skaitļu vērtības, apstrādā tā lai
		//ja konkrētais skaitlis dalās ar 3 bez atlikuma, skaitli aizvietot ar “fizz”, ja ar 5 tad ar “buzz”, ja gan
		//ar 3,gan 5 tad “fizzBuzz”
		
		String[] array = {"1", "2", "3", "5", "8", "30", "15", "12", "7"};
		for (int i = 0; i <array.length; i++) {
			if(Integer.parseInt(array[i]) % 3 == 0 && Integer.parseInt(array[i]) % 5 == 0) {
				array[i] = "fizzBuzz";
			} else if (Integer.parseInt(array[i]) % 3 == 0) {
				array[i] = "fizz";
			} else if (Integer.parseInt(array[i]) % 5 == 0) {
				array[i] = "buzz";
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
