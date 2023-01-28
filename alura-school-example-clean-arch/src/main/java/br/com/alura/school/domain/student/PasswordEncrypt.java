package br.com.alura.school.domain.student;

public interface PasswordEncrypt {

    String encrypt(String password);

    boolean encryptValidator(String passwordEncrypt, String password);

}
