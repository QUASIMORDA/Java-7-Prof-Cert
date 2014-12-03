package igor.package1;

public class ClassWithInner {

	private String outerPrivateMember = "outer: private member";
	public String outerPublicMember = "outer: public member";
	
	class InnerClass{
		private String privateMember = "inner: private member";
		public String publicMember = "inner: public member";
		@Override
		public String toString() {
			return "Inner class";
		}
		
		public String getIdent(){
		   return "base inner class";	
		}
		
		public String getOuterMembers(){
			return "outer public member: " + outerPublicMember + ", outer private member: " + outerPrivateMember;
		}
	}
	
	@Override
	public String toString() {
		return "Outer class";
	}
	
	public String getInnerMembers(){
		InnerClass ic = new InnerClass();
		return "inner public member: " + ic.publicMember + ", inner private member: " + ic.privateMember;
	}

	
}
