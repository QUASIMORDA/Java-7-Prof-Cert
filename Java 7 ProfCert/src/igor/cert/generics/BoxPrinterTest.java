package igor.cert.generics;

public class BoxPrinterTest {

	public static void main(String[] args) {
		BoxPrinter<Integer> bp1 = new BoxPrinter<Integer>(new Integer(10));
		System.out.println(bp1);
		Integer integer1 = bp1.getValue();
		
		BoxPrinter bp3 = new BoxPrinter<Integer>(new Integer(20));
		System.out.println(bp3);
		BoxPrinter<Integer> bp4 = new BoxPrinter<>(new Integer(30));
		System.out.println(bp4);

		BoxPrinter<String> bp2 = new BoxPrinter<String>("Test");
		System.out.println(bp2);
		String str1 = bp2.getValue();
	}

}
