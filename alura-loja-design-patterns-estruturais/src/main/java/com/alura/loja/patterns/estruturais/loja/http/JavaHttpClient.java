package com.alura.loja.patterns.estruturais.loja.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            var urldaApi = new URL(url);
            var connection = urldaApi.openConnection();
            connection.connect();
        } catch (Exception ex) {
            throw new RuntimeException("Erro ao enviar requisição HTTP", ex);
        }
    }
}
