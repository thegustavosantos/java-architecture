package br.com.alura.school.domain.student;

//VALUE OBJECT - Considerados iguais, pode ter um repetido, não tem alguma espécie de ID
public class Email {

    private String address;

    public Email(String address) {

        if(address == null || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            throw new IllegalArgumentException("Invalid Address");
        }

        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
