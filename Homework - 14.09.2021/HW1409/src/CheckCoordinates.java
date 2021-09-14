import java.util.Scanner;

public class CheckCoordinates {

	public static void main(String[] args) {
		// Izveidot Java programmu, kas
		//* No lietotāja pieprasa ievadīt 2 veselus skaitļus => X un Y koordinātas
		//* Programma pārbauda, vai ievadītās X,Y koordinātas ir figūras iekšienē, uz līnijas, vai ārpusē (Figūru skatīt pielikumā)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X coordinate");
		int x = sc.nextInt();
		System.out.println("Enter Y coordinate");
		int y = sc.nextInt();
		
		int Xmin = -2;
		int Xmax = 3;
		int Ymin = -4;
		int Ymax = 1;
		
		if(x > Xmin && x < Xmax && y > Ymin && y < Ymax) {
			System.out.println("Koordinātas (" + x + ";" + y + ") atrodas figūras iekšienē!");
		} else if (((x == Xmin || x == Xmax) && (y == Ymin || y == Ymax)) || ( (x > Xmin && x < Xmax) && (y == Ymin || y == Ymax)) || ((y > Ymin && y < Ymax) && (x == Xmin || x == Xmax))) {
			System.out.println("Koordinātas (" + x + ";" + y + ") atrodas uz figūras līnijas!");
		} else {
			System.out.println("Koordinātas (" + x + ";" + y + ") atrodas figūras ārpusē!");
		}
		
		
	}

}
