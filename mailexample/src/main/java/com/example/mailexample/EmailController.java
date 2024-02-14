package com.example.mailexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
        @Autowired
        private EmailService emailService;

        @GetMapping("/send-email")
        public String sendEmail(){
            String to = "recipient@example.com";
            String subject = "Test Mail";
            String body = "This is a test mail sent from Spring boot";
            emailService.sendSampleMail(to, subject, body);

            return "Email sent successfully";
        }
    }

