import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class uTask17 {

	public static void main(String[] args) {
		// Uzrakstīt programmu, kas no masīva izmet visus duplikātus - vērtības, kas atkārtojas vairāk
		//kā vienu reizi.
		String[] arr = {"ABC","CDE","FGA","CDE","GAE","ABC","ABO"};
	    List<String> list1 = new ArrayList<String>();
	    Collections.addAll(list1, arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i].equals(arr[j])) {
					list1.remove(j);
				}
			}
		}
		
	    System.out.println(list1);
		
	}

}
