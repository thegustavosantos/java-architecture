package br.com.alura.school.domain.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void noMustCreateInvalidPhone(){
        assertThrows(IllegalArgumentException.class , () -> new Phone(null , null));
        assertThrows(IllegalArgumentException.class , () -> new Phone("123" , null));
        assertThrows(IllegalArgumentException.class , () -> new Phone(null , "123"));
    }

    @Test
    void mustCreateValidPhoneWith9digits(){
        assertNotNull(new Phone("11" , "996330132"));
    }

    @Test
    void mustCreateValidPhoneWith8digits(){
        assertNotNull(new Phone("11" , "96330132"));
    }


}