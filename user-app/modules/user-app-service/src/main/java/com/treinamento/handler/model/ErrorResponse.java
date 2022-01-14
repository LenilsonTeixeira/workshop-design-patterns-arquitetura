package com.treinamento.handler.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    @Builder.Default
    @JsonProperty("campos")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Set<FieldResponse> fields = new HashSet<>();

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("mensagem")
    private String message;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("status")
    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("erro")
    private String error;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("timestamp")
    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("path")
    private String path;

    public void addField(final FieldResponse field) {
        this.fields.add(field);
    }
}
