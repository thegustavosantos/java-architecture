package br.com.alura.school.domain.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void noMustCreateInvalidEmail(){
        assertThrows(IllegalArgumentException.class , () -> new Email(null));
        assertThrows(IllegalArgumentException.class , () -> new Email(""));
        assertThrows(IllegalArgumentException.class , () -> new Email("invalidEmail"));
    }

    @Test
    void MustCreateValidEmail(){
        String userEmail = "thegustavosantos@outlook.com";
        Email email = new Email(userEmail);
        assertEquals(userEmail , email.getAddress());

    }


}