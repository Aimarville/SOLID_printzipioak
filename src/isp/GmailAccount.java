package isp;

public class GmailAccount implements Emailable{
	 String name, emailAddress;
	 
	 public GmailAccount(String izena, String email) {
		 this.name = izena;
		 this.emailAddress = email;
	 }
	 
	 public void setName(String n) { name=n; }
	 public String getName() { return name; }
	 
	 public void setEmail (String e) { emailAddress=e; }
	 public String getEmail () { return emailAddress; }
} 
