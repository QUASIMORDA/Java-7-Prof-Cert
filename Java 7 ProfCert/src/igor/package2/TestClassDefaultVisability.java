package igor.package2;

import igor.package1.*;

public class TestClassDefaultVisability {

	public static void main(String[] args) {
		ClassWithDefaultVisability tst = new ClassWithDefaultVisability();
		//tst.setVorname("Igor"); ist hier nicht sichtbar, da protected-Sichtbarkeit 

	}

}
