package br.com.alura.rh.service.reajuste.v2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anuenio implements Reajuste {

    private BigDecimal valor;
    private LocalDate data;

    public Anuenio(BigDecimal valor) {
        this.valor = valor;
        this.data = LocalDate.now();
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }

    @Override
    public LocalDate data() {
        return data;
    }



//    Ferimos o ISP (Interface Segregation Principle) pois essa classe depende de um método vindo da interface que não precisa usar
//    no caso o método valorImpostoDeRenda()
//    @Override
//    public BigDecimal valorImpostoDeRenda() {
//        return BigDecimal.ZERO;
//    }
}
