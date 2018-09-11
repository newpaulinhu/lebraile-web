package br.com.lebraile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lebraile.model.Email;


@RestController
public class EmailController {

    @Autowired private JavaMailSender mailSender;

    @PostMapping(path = "/contato")
    public void contato(@RequestBody Email email) {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setText(email.getMensagem());
        message.setTo("paulo@lebraile.org","cristiano@lebraile.org");
        message.setFrom(email.getEmail());

        try {
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
