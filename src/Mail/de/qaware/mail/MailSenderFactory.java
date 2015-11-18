package de.qaware.mail;

public class MailSenderFactory {
	public MailSender create() {
		return new de.qaware.mail.impl.MailSenderImpl();
	}
}
