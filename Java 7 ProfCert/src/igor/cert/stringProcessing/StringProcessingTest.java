package igor.cert.stringProcessing;

public class StringProcessingTest {

	public static void main(String[] args) {
		// String searching
		String str = "Übung macht den Meister";
		
		System.out.println("Buchstabe m ist an der " + str.indexOf('m') + ". Stelle im String");
		System.out.println("Wort \"Meister\" kommt ab der " + str.indexOf("Meister") + ". Stelle");
		System.out.println("Das zweites e im Meister kommt an der " + str.indexOf('e', 18) + ". Stelle");
		
		System.out.println("Artikel \"den\" gefunden: " + str.regionMatches(true, 12, "tt den m", 3, 5));
		
		//Conversing
		System.out.println("Integer string: " + String.valueOf(10));
		System.out.println("Float string: " + String.valueOf(12.8f));
		System.out.println("Boolean string: " + String.valueOf(false));
		System.out.println("Integer object string: " + String.valueOf(new Integer(111)));
		
		System.out.println("Integer from string: " + Integer.parseInt("123"));
		System.out.println("Boolean from string: " + Boolean.parseBoolean("true"));
		System.out.println("Double from string: " + Double.parseDouble("12345.8907"));
		
		// Pattern Matching
	}

}
