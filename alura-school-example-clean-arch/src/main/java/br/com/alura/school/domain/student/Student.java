package br.com.alura.school.domain.student;

import java.util.ArrayList;
import java.util.List;

//ENTITY - Considerado uma entidade única
public class Student {

    private CPF cpf;
    private String name;
    private Email email;
    private List<Phone> phones = new ArrayList<>();
    private String password;


    public void addPhone(String ddd , String number){
        this.phones.add(new Phone(ddd, number));
    }

    public Student(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public String getCPF(){
        return cpf.getNumber();
    }

    public String getName() {
        return name;
    }

    public String getEmail(){
        return email.getAddress();
    }

    public List<Phone> getPhones() {
        return phones;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cpf=" + cpf +
                ", name='" + name + '\'' +
                ", email=" + email +
                ", phones=" + phones +
                ", password='" + password + '\'' +
                '}';
    }
}
