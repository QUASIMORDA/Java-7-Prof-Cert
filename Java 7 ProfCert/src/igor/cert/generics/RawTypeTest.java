package igor.cert.generics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTypeTest {

	public static void main(String[] args) {
		List<String> strList1 = new LinkedList<>(); 
		strList1.add("Eins");
		strList1.add("Zwei");
		
		List list1 = strList1;
		list1.add(new Integer(3));
		
		for (Iterator iterator = list1.iterator(); iterator.hasNext();) {
			System.out.println(iterator.next());
			
		}
		
		// Runtime Exception
		for(Iterator<String> iter = list1.iterator(); iter.hasNext();){
			System.out.println(iter.next());
		}
		
		List list2 = new LinkedList();
		list2.add("Eins");
		list2.add("Zwei");
		
		List<String> strList2 = list2;
		//strList2.add(new Integer(3));
	}

}
