package com.treinamento.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

@Log4j2
@UtilityClass
public class FieldTranslator {

    private static final Map<String, String> FIELDS = loadFields("fields.json");

    public static String translate(final String value) {
        return Optional.ofNullable(value)
                .filter(FIELDS::containsKey)
                .map(FIELDS::get)
                .orElse(value);
    }

    private static Map<String, String> loadFields(final String resource) {
        try (final InputStream is = new ClassPathResource(resource).getInputStream()) {
            final byte[] bytes = FileCopyUtils.copyToByteArray(is);
            return Collections.unmodifiableMap(new ObjectMapper().readValue(bytes, new TypeReference<Map<String, String>>() {}));
        } catch (Exception e) {
            log.error("Falha ao ler arquivo de dicionário de campos", e);
            throw new IllegalStateException("Falha ao ler arquivo de dicionário de campos", e);
        }
    }
}
