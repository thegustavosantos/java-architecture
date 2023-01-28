package br.com.alura.school.domain.student;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void noMustCreateInvalidCPF(){
        assertThrows(IllegalArgumentException.class , () -> new CPF(null));
        assertThrows(IllegalArgumentException.class , () -> new CPF(""));
        assertThrows(IllegalArgumentException.class , () -> new CPF("invalidCPF"));
    }

    @Test
    void MustCreateValidCPF(){
        String number = "455.829.458-14";
        CPF cpf = new CPF(number);
        assertEquals(number , cpf.getNumber());
    }


}