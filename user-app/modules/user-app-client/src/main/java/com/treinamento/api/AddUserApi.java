package com.treinamento.api;

import com.treinamento.model.adduser.AddUserRequest;
import com.treinamento.model.adduser.AddedUserResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.validation.Valid;

public interface AddUserApi {

    @PostMapping("users")
    @ResponseStatus(HttpStatus.CREATED)
    AddedUserResponse add(@RequestBody @Valid final AddUserRequest addUserRequest);
}
