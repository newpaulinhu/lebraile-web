package br.com.lebraile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.lebraile.component.EmailComponent;
import br.com.lebraile.model.Email;


@RestController
public class EmailController {

    @Autowired private EmailComponent emailComponent;

    @PostMapping(path = "/contato")
    public void contato(@RequestBody Email email) {
    	emailComponent.enviarEmail(email);
    }

}
