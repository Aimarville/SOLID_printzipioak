package ocp;

import java.util.*;

public class AuthService {
	private Map<String, AuthProvider> providers = new HashMap<>();
	
	public AuthService(List<AuthProvider> providerList) {
		for (AuthProvider p : providerList) {
			providers.put(p.getServiceName(), p);
		}
	}
	
	public boolean signIn(String service, String user, String pass) {
		AuthProvider provider = providers.get(service.toLowerCase());
		if (provider == null) return false;
		return provider.signIn(user, pass);
	}
}
