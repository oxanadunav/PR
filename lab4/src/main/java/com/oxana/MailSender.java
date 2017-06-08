package com.oxana;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

import java.util.Scanner;

class MailSender {

    private Scanner read;

    public MailSender() {
        read = new Scanner(System.in);
    }


    public void sendMail() throws EmailException {

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setAuthentication("oxana.dunav@gmail.com", "30051972");
        email.setSmtpPort(587);
        email.setStartTLSEnabled(true);

        System.out.println("Recipient: ");
        email.addTo(read.nextLine());
        email.setFrom("oxana.dunav@gmail.com");
        System.out.println("Email subject: ");
        email.setSubject(read.nextLine());
        System.out.println("Message");
        email.setMsg(read.nextLine());
        email.send();
    }

}
