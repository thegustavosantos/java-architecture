package br.com.alura.rh.service.reajuste.v2;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {

    BigDecimal valor();
    LocalDate data();

//    BigDecimal valorImpostoDeRenda();
}
