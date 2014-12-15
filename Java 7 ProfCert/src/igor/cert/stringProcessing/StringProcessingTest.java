package igor.cert.stringProcessing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		String str2 = "Igor, Jula, Stern";
		for(String el:str2.split(", ") ){
			System.out.println("'" + el + "'");
		}
		
		// RegExps
		String str3 = "123 mama 456 papa hallo 23";
		Pattern pattern1 = Pattern.compile("\\D+\\s");
		Matcher matcher1 = pattern1.matcher(str3);
		while(matcher1.find()){
			System.out.println(matcher1.group());
		}
		
		Pattern pattern2 = Pattern.compile("\\d{2,}");
		Matcher matcher2 = pattern2.matcher(str3);
		String res = matcher2.replaceAll("XXX");
		System.out.println(res);
		
		System.out.println(Pattern.matches(".+mama 456.+", str3));
		
		// String formatting
		System.out.printf("%-10s%n", "igor");
		System.out.printf("%010d\n", 17);
		System.out.printf("%2.3f\n", 17.1236567);
		System.out.printf("%5.3f\n", 17.1);
		System.out.printf("%5d\n", 17);
		System.out.printf("%o\t%x\t%h\n", 17, 17, 17);
		//System.out.printf("%5d\n"); MissingFormatArgumentException
		String formattedString = String.format("%-10s", "igor");
		System.out.println("'" + formattedString + "'");
		
	}

}
