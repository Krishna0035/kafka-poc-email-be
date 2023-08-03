package com.kafkapoc.kafkapocemail.controller;

import com.kafkapoc.kafkapocemail.dto.SendMailDto;
import com.kafkapoc.kafkapocemail.emailservice.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendEmail")
    public String sendTestEmail(@RequestBody SendMailDto sendMailDto) {

        for(String to : sendMailDto.getRecipients()){
            String recipient = to;
            String subject = sendMailDto.getSubject();
            String text = sendMailDto.getBody();
            emailService.sendEmail(recipient, subject, text);

        }
        return "Email sent successfully!";
    }


    @PostMapping("/send")
    public String sendemail(@RequestBody SendMailDto sendMailDto) {


            String recipient = sendMailDto.getRecipients().get(0);
            String subject = sendMailDto.getSubject();
            String text = sendMailDto.getBody();
            emailService.sendEmail(recipient, subject, text);


        return "Email sent successfully!";
    }
}
