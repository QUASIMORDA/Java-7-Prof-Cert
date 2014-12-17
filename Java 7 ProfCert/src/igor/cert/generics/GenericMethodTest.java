package igor.cert.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Eins");
		list.add("Zwei");
		
		GenericMethodClass.fill(list, "Neun");
		
		System.out.println(list);
		
		GenericMethodClass.fill(list, "Drei");
		
	}

}
