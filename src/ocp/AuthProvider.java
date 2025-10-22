package ocp;

public interface AuthProvider {
	boolean signIn(String user, String pass);
	String getServiceName();
}
