import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
	public List<String> arr1;
	public List<String> arr2;
	public List<String> arr3;
	
	public Board (){
		String[] array = {"|", " ", "|", " ", "|", " ", "|"};
		this.arr1 = new ArrayList<String>(Arrays.asList(array));
		this.arr2 = new ArrayList<String>(Arrays.asList(array));
		this.arr3 = new ArrayList<String>(Arrays.asList(array));
	}
	
	public void print() {
		for (int i = 0; i < this.arr1.size(); i++) {
			System.out.print(this.arr1.get(i));
		}
		System.out.println();
		for (int i = 0; i < this.arr2.size(); i++) {
			System.out.print(this.arr2.get(i));
		}
		System.out.println();
		for (int i = 0; i < this.arr3.size(); i++) {
			System.out.print(this.arr3.get(i));
		}
	}
	

}
