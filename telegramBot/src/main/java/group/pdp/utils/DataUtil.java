package group.pdp.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class DataUtil {
    private static final ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);

    public static <T> void write(List<T> ts, String path) {
        try {
            objectMapper.writeValue(new File(path), ts);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> List<T> read(String path) {
        try {
            return objectMapper.readValue(new File(path), new TypeReference<>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
