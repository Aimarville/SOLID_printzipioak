package ocp;

public class GoogleAuthProvider implements AuthProvider {

	@Override
	public boolean signIn(String user, String pass) {
		// use the google api
		return true;
	}

	@Override
	public String getServiceName() {
		return "google";
	}
	
}
