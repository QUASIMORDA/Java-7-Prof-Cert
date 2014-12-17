package igor.cert.generics;

import java.util.LinkedList;
import java.util.List;

public class PairTest {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "Test1");
		System.out.printf("First: %d, second: %s%n", p1.getFirst(), p1.getSecond());
		
		Pair<String, Integer> p2 = new Pair<>("Test2", 2);
		System.out.printf("First: %s, second: %d%n", p2.getFirst(), p2.getSecond());
		
		Pair<String, Integer> p3 = new Pair("Test3", 3);
		System.out.printf("First: %s, second: %d", p3.getFirst(), p3.getSecond());
		
		List<String> list1 = new LinkedList<>();
	}

}
