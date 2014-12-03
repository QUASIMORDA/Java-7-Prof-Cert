package igor.package1;

public class ClassWithInnerExt extends ClassWithInner{
	class InnerClassExt extends ClassWithInnerExt.InnerClass{

		@Override
		public String getIdent() {
			
			return "Extended inner class";
		}
		
	}
}
