package ocp;

public class TwitterAuthProvider implements AuthProvider {

	@Override
	public boolean signIn(String user, String pass) {
		// use the twitter api
		return true;
	}

	@Override
	public String getServiceName() {
		return "twitter";
	}
	
}
