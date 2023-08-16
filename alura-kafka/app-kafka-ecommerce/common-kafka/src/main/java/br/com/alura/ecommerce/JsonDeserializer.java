package br.com.alura.ecommerce;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class JsonDeserializer<T> implements Deserializer<T> {
    public static final String TYPE_CONFIG = "br.com.alura.ecommerce.type_config";
    private Class<T> type;

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        String typeName = String.valueOf(configs.get(TYPE_CONFIG));
        try {
            this.type = (Class<T>) Class.forName(typeName);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Type for deserialization does not exist in the class path");
        }
    }

    @Override
    public T deserialize(String s, byte[] bytes) {
        try {
            return new ObjectMapper().readValue(bytes,type);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw new RuntimeException("Convert to Json had a problem");
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Convert to Json had a problem");
        }
    }
}
