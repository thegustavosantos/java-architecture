package br.com.alura.school.infra.student;

import br.com.alura.school.domain.student.PasswordEncrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordEncryptMD5 implements PasswordEncrypt {


    @Override
    public String encrypt(String password) {

        try {
            var md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            var sb = new StringBuilder();
            for(int i = 0; i<bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error when generated password hash");
        }
    }

    @Override
    public boolean encryptValidator(String passwordEncrypt, String password) {
        return passwordEncrypt.equals(this.encrypt(password));
    }

}
