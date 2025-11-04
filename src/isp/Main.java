package isp;

public class Main {

	public static void main(String[] args) {
		GmailAccount emKontu = new GmailAccount("Asier", "asier@gmail.com");
		
		EmailSender sender = new EmailSender();
		
		sender.sendEmail(emKontu, "Kaixo");
	}
}
