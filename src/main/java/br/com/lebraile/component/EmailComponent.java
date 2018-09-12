package br.com.lebraile.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import br.com.lebraile.model.Email;

@Component
public class EmailComponent {

	@Autowired 
	private JavaMailSender mailSender;

	public void enviarEmail(Email email) {
	
		SimpleMailMessage message = new SimpleMailMessage();

        message.setSubject(email.getAssunto());
        message.setTo("paulo@lebraile.org","cristiano@lebraile.org");
        message.setFrom(email.getEmail());
        message.setText(String.format("Contato: %s, %n%n Mensagem: %n %s", email.getEmail(), email.getMensagem()));

        try {
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
}
