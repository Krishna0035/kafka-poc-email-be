package com.kafkapoc.kafkapocemail.controller;

import com.kafkapoc.kafkapocemail.emailservice.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final EmailService emailService;

    @Autowired
    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/sendEmail")
    public String sendTestEmail(@RequestBody String to) {
        String recipient = to;
        String subject = "Test Email";
        String text = "This is a test email sent using Mailtrap and Spring Boot!";
        emailService.sendEmail(recipient, subject, text);
        return "Email sent successfully!";
    }
}
