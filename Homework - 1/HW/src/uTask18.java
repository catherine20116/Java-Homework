import java.util.Arrays;

public class uTask18 {

	public static void main(String[] args) {
		// Divu dimensiju masīvā tiek glabātas skolnieku punkti testos, tā ka katra rinda atbilst vienam
		//studentam. Uzrakstīt programmu, kura aprēķina studentu vidējās atzīmes un saglabā tās vienā
		//masīvā.
		
		double[][] grades = {{68, 58, 79}, {79, 76, 81}};
		double[] averages = new double[grades.length];

		
		for (int i = 0; i < grades.length; i++) {
			double total = 0;
			double average = 0;
			for (int j = 0; j < grades[i].length; j++) {
				total += grades[i][j];
			}
			average = total / grades[i].length;
			averages[i] = average;
			}
		
		System.out.println(Arrays.toString(averages));
		
	}

}
