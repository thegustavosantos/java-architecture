package com.alura.loja.patterns.estruturais.loja.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String,Object> dados);

}
