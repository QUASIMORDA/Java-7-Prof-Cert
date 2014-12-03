package igor.package2;

public class TestClass {

	public static void main(String[] args) {
		//Singelton 
		System.out.println("*****Singelton*****");
		Singelton sing = Singelton.getInstance();
		System.out.println("singelton instance number: " + sing.COUNT);

		Singelton sing2 = Singelton.getInstance();
		System.out.println("singelton instance number: " + sing2.COUNT);
		
		WahreSingelton ws1 = WahreSingelton.getInstance();
		System.out.println("wahre singelton instance number: " + ws1.COUNT);
		
		WahreSingelton ws2 = WahreSingelton.getInstance();
		System.out.println("wahre singelton instance number: " + ws2.COUNT);
		System.out.println("\n\n");
	}

}
