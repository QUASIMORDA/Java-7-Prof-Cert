package igor.package2;

public class WahreSingelton {
	private static WahreSingelton instance = new WahreSingelton();
	static public Integer COUNT;
	
	private WahreSingelton(){
		if(COUNT == null){
			COUNT = 1;
		}else COUNT += 1;
	}
	
	public static WahreSingelton getInstance(){
		return instance;
	}
}
