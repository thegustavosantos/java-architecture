package br.com.alura.ecommerce;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Serializer;

public class JsonSerializer<T> implements Serializer<T> {

    @Override
    public byte[] serialize(String s, T object) {
        byte[] bytes = new byte[0];

        try {
            bytes = new ObjectMapper().writeValueAsBytes(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return bytes;
    }
}
