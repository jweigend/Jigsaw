package de.qaware.mail.client;

import de.qaware.mail.MailSender;
import de.qaware.mail.MailSenderFactory;

public class MailClient {

	public static void main(String [] args) {
		// MailSender mail = new de.qaware.mail.impl.MailSenderImpl(); // --> should not work
		MailSender mail = new MailSenderFactory().create();
		mail.sendMail("johannes@qaware.de", "A message from JavaModule System");

	}	
}
