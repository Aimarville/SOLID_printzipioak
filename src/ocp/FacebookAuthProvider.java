package ocp;

public class FacebookAuthProvider implements AuthProvider {

	@Override
	public boolean signIn(String user, String pass) {
		// use the FB api
		return true;
	}

	@Override
	public String getServiceName() {
		return "facebook";
	}
	
}
