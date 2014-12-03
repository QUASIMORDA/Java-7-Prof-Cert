package igor.package1;

public class ClassWithLocalInner {
	public String outerPublicMember = "outer public member";
	private String outerPrivateMember = "outer private member";
	
	public String getEnything(){
		final String localVar = "local variable";
		class LocalInner{
			public String innerPublicMember = "inner public member";
			private String innerPrivateMember = "inner private member";
			
			public String getIdent(){
				return "local inner class";
			}
			
			public String getOuterMembers(){
				return "Outer public member: " + outerPublicMember + ", outer private member: " + outerPrivateMember;
			}
			
			public String getLocalMembers(){
				return "Local member: " + localVar;
			}
		}
		
		LocalInner li = new LocalInner();

		return "message from local inner class: " + li.getIdent() + ", outer members: " 
		       + li.getOuterMembers() + ", inner members: " + li.innerPublicMember + ", " + li.innerPrivateMember + "\n" + li.getLocalMembers();
		
	}
}
