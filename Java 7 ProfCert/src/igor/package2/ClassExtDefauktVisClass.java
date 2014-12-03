package igor.package2;

import igor.package1.ClassWithDefaultVisability;

public class ClassExtDefauktVisClass extends ClassWithDefaultVisability {
	public void printVorname(){
		super.getVorname();
	}
	
	public String getVorname(){
		return super.getVorname();
	}
}
