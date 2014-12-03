package igor.package2;

public class Singelton {
	static private Singelton instance;
	static public int COUNT = 0;
	private Singelton(){
		COUNT += 1;
	}
	
	static public Singelton getInstance(){
		if (instance == null) {
			instance = new Singelton();
		}
		
		return instance;
	}
}
