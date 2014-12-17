package igor.cert.generics;

import java.util.List;

public class GenericMethodClass {
	public static <T> void fill(List<T> list, T val){
		for(int i = 0; i < list.size(); i++){
			list.set(i, val);
		}
		
	}
}
