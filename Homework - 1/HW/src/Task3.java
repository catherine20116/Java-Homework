import java.util.Scanner;
import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		// Write a programm, that has input of 2 int a and b, and produces/ outputs the sum of those numbers, 
		//but number from 10 to 19 are not allowed. if 10 to 19 - output 20
		Integer[] array = new Integer[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		sc.close();
		int sum = a + b;
		
		if(Arrays.asList(array).contains(sum)) {
			System.out.println("20");
		} else {
			System.out.println(sum);
		}
	}

}
