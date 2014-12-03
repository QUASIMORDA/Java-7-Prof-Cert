package igor.package1;


public class TestClass {

	public static void main(String[] args) {
		// Static inner class
		System.out.println("*****Static inner class*****");
		ClassWithStaticInner outer = new ClassWithStaticInner();
		ClassWithStaticInner.StaticInner staticInner = new ClassWithStaticInner.StaticInner();
		System.out.println(outer);
		System.out.println(staticInner);
		System.out.println(outer.printInner());
		System.out.println(staticInner.printOuter());
		StaticInnerExt six = new StaticInnerExt();
		System.out.println(six.getIdent());
		System.out.println("\n\n");
		
		// Inner class
		System.out.println("*****Inner class*****");
		ClassWithInner cwi = new ClassWithInner();
		ClassWithInner.InnerClass ic = cwi.new InnerClass();
		System.out.println(cwi);
		System.out.println(ic);
		ClassWithInnerExt cwix = new ClassWithInnerExt();
		ClassWithInnerExt.InnerClassExt icx = cwix.new InnerClassExt();
		System.out.println(icx.getIdent());
		System.out.println(ic.getOuterMembers());
		System.out.println(cwi.getInnerMembers());
		System.out.println("\n\n");
		
		//Local inner class
		System.out.println("*****Local inner class*****");
		ClassWithLocalInner cwli = new ClassWithLocalInner();
		System.out.println(cwli.getEnything());
		System.out.println("\n\n");
		
		// Anonym local class
		System.out.println("*****Anonymous Local class*****");
		ClassWithAnonymLocal cwal = new ClassWithAnonymLocal();
		System.out.println(cwal.getFromAnonym());

	}

}
