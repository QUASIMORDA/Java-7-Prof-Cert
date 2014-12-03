package igor.package1;

public class ClassWithStaticInner {
	public static String name = "Igor";
	private boolean diplom = true;

	static class StaticInner{
		public int age = 20;
		public static final double PI = 3.14;
		@Override
		public String toString() {
			return "Static Inner Class";
		}
		
		public String printOuter(){
			
			return "Outer: Name = " + name;
		}
		
		public String getIdent(){
			return "static inner class";
		}
	}
	
	@Override
	public String toString() {
		return "Outer Class";
	}
	
	public String printInner(){
		StaticInner si = new StaticInner();
		return "Static Inner: age = " + si.age + ", PI = " + StaticInner.PI;
	}
	
	
}
