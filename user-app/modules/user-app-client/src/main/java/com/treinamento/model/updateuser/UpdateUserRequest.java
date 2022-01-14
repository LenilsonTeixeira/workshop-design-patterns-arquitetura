package com.treinamento.model.updateuser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateUserRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotEmpty(message = "O nome é obrigatório")
    @JsonProperty("nome")
    private String name;

    @Email(message = "O email deve ser válido")
    @JsonProperty("email")
    private String email;

    @NotNull(message = "A idade é obrigatória")
    @Min(message = "A idade deve ser maior que 0", value = 1)
    @JsonProperty("idade")
    private Integer age;

}
