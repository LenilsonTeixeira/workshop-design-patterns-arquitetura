package com.treinamento.adduser;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddUserDomain implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String email;
    private Integer age;
}
