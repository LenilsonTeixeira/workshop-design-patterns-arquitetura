package com.treinamento.api;

import com.treinamento.model.updateuser.UpdateUserRequest;
import com.treinamento.model.updateuser.UpdatedUserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

public interface UpdateUserApi {

    @PutMapping("users/{id}")
    @ResponseStatus(HttpStatus.OK)
    UpdatedUserResponse update(@PathVariable("id") final Long id,
                               @RequestBody @Valid final UpdateUserRequest updateUserRequest);
}
