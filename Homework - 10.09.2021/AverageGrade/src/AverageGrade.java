import java.util.Random;
import java.util.Arrays;

public class AverageGrade {

	public static void main(String[] args) {
		Random rand = new Random();
		int int_random = rand.nextInt(41) + 10;
		
		// int array
		System.out.println("Below is the integer array:");
		int[] grades_int = new int[int_random];
		int sum = 0;
		for(int i = 0; i < grades_int.length; i++) {
			grades_int[i] = rand.nextInt(10) + 1;
			if (i == grades_int.length - 1) {
				System.out.print(grades_int[i] + "");
			} else {
				System.out.print(grades_int[i] + ", ");
			}
			sum += grades_int[i];
		}
		System.out.println();
		System.out.println("The average of the grades is: " + sum / grades_int.length);
		
		
		// float array
		System.out.println();
		System.out.println("Below is the float array:");
		float[] grades_float = new float[int_random];
		float sumFloat = 0.0f;
		for(int i = 0; i < grades_float.length; i++) {
			grades_float[i] = rand.nextFloat()*9 + 1;
			if (i == grades_float.length - 1) {
				System.out.print(grades_float[i] + "");
			} else {
				System.out.print(grades_float[i] + ", ");
			}
			sumFloat += grades_float[i];
		}
		System.out.println();
		System.out.println("The average of the float grades is: " + sumFloat / grades_float.length);

	}

}

/*
 Create a Java console application that:
 produces an array of numbers (grades) that is created for storing grades. +
 The size of the array is randomly selected between 10(incl) and 50 (incl). +
 The array grades are populated with random numbers between 1(incl) and 10(incl). +
 The contents of the array are output to the console without using the Arrays.toString method. + 
 The average value of the elements of the array grades is calculated and displayed on the screen.
 An additional challenge: to store decimals (float) in an array.
*/
