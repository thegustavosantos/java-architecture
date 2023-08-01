package br.com.alura.shared.dominio.eventos;

import java.time.LocalDateTime;
import java.util.Map;

public interface Evento {

    LocalDateTime momento();
    TipoDeEvento tipo();
    Map<String, Object> informacoes();

}
