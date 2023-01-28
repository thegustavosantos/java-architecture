package br.com.alura.school.domain.student;

//VALUE OBJECT - Considerados iguais, pode ter um repetido, não tem alguma espécie de ID
public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {

        if(ddd == null || !ddd.matches("[1-9]{2}")){
            throw new IllegalArgumentException("Invalid Phone DDD");
        }
        if(number == null || !number.matches("[0-9]{8}|[0-9]{9}")){
            throw new IllegalArgumentException("Invalid Phone number");
        }
        this.ddd = ddd;
        this.number = number;

    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }

}
