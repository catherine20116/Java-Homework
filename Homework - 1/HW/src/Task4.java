import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// Write a program, with 3 int inputs which produces a sum, but if one of the ints matches, then this number does not add up to the sum. 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		sc.close();
		int sum = 0;
		
		if(a==b && b==c) {
			System.out.println("0");
		} else if (a == b) {
			System.out.println(sum + c);
		} else if (a == c) {
			System.out.println(sum + b);
		} else if (b == c) {
			System.out.println(sum + a);
		} else {
			System.out.println(sum + a + b + c);
		}

	}

}
