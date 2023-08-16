package br.com.alura.ecommerce;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Email {

    private String subject, body;

    public Email(String subject, String body) {
        this.subject = subject;
        this.body = body;
    }

    public Email() {

    }

}
