package ocp;

public class AppleAuthProvider implements AuthProvider {

	@Override
	public boolean signIn(String user, String pass) {
		// use the apple api
		return true;
	}

	@Override
	public String getServiceName() {
		return "apple";
	}
	
}
