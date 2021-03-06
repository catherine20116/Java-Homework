import java.util.ArrayList;
import java.util.Arrays;

public class uTask19 {

	//Check if num of values in each row is equal == columns
	public static int checkRowLength(int[][] arr) {
		ArrayList <Integer> rowsLength = new ArrayList <Integer>();
		for (int i = 0; i < arr.length; i++) { 
			rowsLength.add(arr[i].length);
		}
		boolean match = rowsLength.stream().allMatch(s -> s.equals(rowsLength.get(0)));
		if(match) {
			return rowsLength.get(0);
		} else {
			return -1;
		}
		}
	
	//Check rows num
	public static int checkRow(int[][] arr) {
		return arr.length;
	}
	
	// Check row sum
	public static int checkRowsSum (int[][] arr) {
		ArrayList <Integer> rowSum = new ArrayList <Integer>();
		for (int i = 0; i < arr.length; i++) { 
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			rowSum.add(sum);
		}
		
		boolean match = rowSum.stream().allMatch(s -> s.equals(rowSum.get(0)));
		
		if(match) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[0][i];
			}
			return sum;
		} else {
			return -1;
		}
	}
	
	// Check col sum 
	public static int checkColsum (int[][] arr) {
		ArrayList <Integer> colSum = new ArrayList <Integer>();
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			colSum.add(sum);
		}
		boolean match = colSum.stream().allMatch(s -> s.equals(colSum.get(0)));
		if(match) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i][0];
			}
			return sum;
		} else {
			return -2;
		}
	}
	
	// Check diag1 sum 
	public static int checkDiagOne (int[][] arr) {
		ArrayList <Integer> DiagOne = new ArrayList <Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(j == i) {
					DiagOne.add(arr[i][j]);
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < DiagOne.size(); i++) {
			sum += DiagOne.get(i);
		}
		return sum;
	}
	
	// Check diag2 sum 
	public static int checkDiagTwo (int[][] arr) {
	    int[][] dst = new int[arr.length][arr[0].length];
	    for (int i = 0; i < arr.length; i++) {
	        dst[i] = Arrays.copyOf(arr[i], arr[i].length);
	    }
	    
		
		for (int i = 0; i < dst.length; i++) {
			for (int j = 0; j < dst[i].length; j++) {
				if(j != dst[i].length - 1) {
					int temp = dst[i][j];
					dst[i][j] = dst[i][dst[i].length - 1 - j];
					dst[i][dst[i].length - 1 - j] = temp;
				}

			}
		}
		
		ArrayList <Integer> DiagTwo = new ArrayList <Integer>();
		for (int i = 0; i < dst.length; i++) {
			for (int j = dst[i].length - 1; j >= 0; j--) {
				if(j == i) {
					DiagTwo.add(dst[i][j]);
				}
			}
		}
		int sum = 0;
		for (int i = 0; i < DiagTwo.size(); i++) {
			sum += DiagTwo.get(i);
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// Uzrakst??t programmu, kura p??rbauda vai divu dimensiju mas??vs ir ma??iskais kvadr??ts:
		//??? Abas dimensijas vien??da garuma ++
		//??? Visu rindu summas ir vien??das ++
		//??? Visu kolonnu summas ir vien??das++
		//??? Abu diagon????u summas ir vien??das
		//??? Visas 3 iepriek?? min??t??s summas ir vien??das ++
		

		
		int[][] arr = {{17, 10, 15}, {12, 14, 16}, {13, 18, 11}}; 		
		int numOfCol = checkRowLength(arr);
		int numOfRows = checkRow(arr);
		
		/*
		System.out.println("Number of cols " + numOfCol);
		System.out.println("Number of rows " + numOfRows);
		System.out.println("Sum across rows " + checkRowsSum(arr));
		System.out.println("Sum across columns " +checkColsum(arr));
		System.out.println("Sum across diag one " +checkDiagOne(arr));
		System.out.println("Sum across diag two " +checkDiagTwo(arr));
		*/
		
		if(numOfCol == numOfRows && checkRowsSum(arr) == checkColsum(arr) && checkColsum(arr) == checkDiagOne(arr) && checkDiagOne(arr) == checkDiagTwo(arr)) {
			System.out.println("This is a magic square");
		} else {
			System.out.println("This is not a magic square");
		}

	}

}
