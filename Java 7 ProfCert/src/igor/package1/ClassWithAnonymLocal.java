package igor.package1;

public class ClassWithAnonymLocal {

	private String outerPrivateMember = "outer private";
	public String outerPublicMember = "outer public";
	interface Message{
		String getMessage();
	}
	public String getFromAnonym(){
		final String localMember = "local member";
		Message msg = new Message(){
			private String innerPrivateMember = "inner private";
			public String innerPublicMember = "inner public";
			@Override
			public String getMessage() {
				
				return "Message from anonym local class: \n" + "outer members: " + outerPublicMember + ", " + outerPrivateMember + "\nlocal members: " + localMember;
			}
			
		};
		return msg.getMessage() + "\nInner members: kein Zugriff";
	}
}
