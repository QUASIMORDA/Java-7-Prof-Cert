package igor.cert.generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardUse {
	
	class Person{
		private String name;
		private String firstname;
		
		public Person(String name, String firstname){
			this.name = name;
			this.firstname = firstname;
		}
		
		public String getFullName(){
			return name + ", " + firstname;
		}
	}

	static void printList(List<?> list){
		for (Object object : list) {
			System.out.println("[" + object + "]");
			
		}
	}
	
	public static Double sum(List<? extends Number> list){
		Double result = 0.0;
		for(Number el : list){
			result += el.doubleValue();
		}
		return result;
	}
	
	public static void main(String[] args) {
		WildCardUse wcu = new WildCardUse();
		List<WildCardUse.Person> plist = new ArrayList<>();
		plist.add(wcu.new Person("Kafka", "Franz"));
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(100);
		printList(intList);
		
		List<String> strList = new ArrayList<>();
		strList.add("10");
		strList.add("100");
		printList(strList);
		
		List rawList = new ArrayList();
		rawList.add(10);
		rawList.add("100");
		printList(rawList);
		
		System.out.println("Sum of integers " + sum(intList));
		
		List<Double> dList = new ArrayList<>();
		dList.add(11.1);
		dList.add(12.2);
		System.out.println("Sum of doubles " + sum(dList));
	}

}
