package com.treinamento.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.experimental.UtilityClass;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.IOException;
import java.io.InputStream;

@UtilityClass
public class ReadFileUtils {

    private final static ObjectMapper MAPPER = new ObjectMapper();

    public static byte[] read(final String file) {
        try (final InputStream inputStream = new ClassPathResource(file).getInputStream()) {
            return FileCopyUtils.copyToByteArray(inputStream);
        } catch (Exception e) {
            throw new RuntimeException(String.format("Erro ao processar arquivo: %s", file));
        }
    }

    public static <T> T readAsJson(final String file, final Class<T> clazz) {
        try {
            MAPPER.registerModule(new JavaTimeModule());
            return MAPPER.readValue(read(file), clazz);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
