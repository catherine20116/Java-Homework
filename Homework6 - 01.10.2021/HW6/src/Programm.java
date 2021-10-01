import java.util.Map;
import java.util.TreeMap;

import classes.Person;

public class Programm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Yekaterina", "Kurochkina", "1996-08-26");
		Person p2 = new Person("Yekaterina", "Kurochkina", "1995-08-26");
		Person p3 = new Person("Yekaterina", "Kurochkina", "1994-08-26");

		Map<Person, String> personNicknames = new TreeMap<Person, String>();
		personNicknames.put(p1, "yekku");
		personNicknames.put(p2, "yekku");
		personNicknames.put(p3, "yekku");
		
		System.out.println(personNicknames);
		
		  for(Map.Entry<Person, String> entry: personNicknames.entrySet()) {
		       System.out.println(entry.getKey() + " > " +entry.getValue() );
		      }
				
		}
		
	}


